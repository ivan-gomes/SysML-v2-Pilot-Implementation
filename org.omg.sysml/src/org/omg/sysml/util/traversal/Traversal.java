/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal;

import java.util.HashMap;
import java.util.Map;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

/**
 * Implement the traversal of a graph of SysML Elements in which non-Relationship Elements are
 * connected only by Relationship Elements.
 * 
 * @author Ed Seidewitz
 *
 */
public class Traversal {
	
	/**
	 * The facade used for processing Elements and Relationships.
	 */
	private final ElementProcessingFacade facade;
	
	/**
	 * The map that records the identifiers for visited Elements.
	 */
	protected final Map<Element, Object> elementMap = new HashMap<>();
	
	/**
	 * Create a new traversal object using given visitor factory.
	 * 
	 * @param 	facade			the ElementProcessingFacade to be used for this traversal
	 */
	public Traversal(ElementProcessingFacade facade) {
		this.facade = facade;
	}
	
	public ElementProcessingFacade getFacade() {
		return this.facade;
	}
	
	/**
	 * Get the identifier corresponding to the given Element (if any).
	 * 
	 * @param 	element			the Element to be identified
	 * @return	the identifier for the given Element, or null if none has been recorded
	 */
	public Object getIdentifier(Element element) {
		return this.elementMap.get(element);
	}
	
	/**
	 * Record an identifier for the given Element.
	 * 
	 * @param 	element			the Element to be identified
	 * @param 	identifier		the identifier to be used for the given Element
	 */
	public void putIdentifier(Element element, Object identifier) {
		this.elementMap.put(element, identifier);
	}
	
	/**
	 * Reset the traversal by clearing the element to identifier map.
	 */
	public void reset() {
		this.elementMap.clear();
	}
	
	/**
	 * Run the given Element visitor. If the visitor returns a non-null identifier, then
	 * record this as the identifier for the Element that was visited.
	 * 
	 * @param 	visitor			the Element visitor to be run
	 * @return	the identifier generated by the Element visitor
	 */
	protected Object visit(ElementVisitor visitor) {
		Object identifier = visitor.visit();
		if (identifier != null) {
			this.putIdentifier(visitor.getElement(), identifier);
		}
		return identifier;
	}
	
	/**
	 * Check whether the given Element has been visited previously. If so, then return
	 * that identifier without doing any processing. Otherwise, create a visitor and
	 * use it to visit the given Element.
	 * 
	 * @param 	element			the Element to be visited
	 * @return	the identifier to be used for that Element
	 */
	public Object visit(Element element) {
		Object identifier = this.getIdentifier(element);
		return identifier != null? identifier:
				this.visit(this.createVisitor(element));
	}
	
	/**
	 * Create an Element visitor for the given element.
	 */
	public ElementVisitor createVisitor(Element element) {
		return new ElementVisitor(element, this, this.facade);
	}

}
