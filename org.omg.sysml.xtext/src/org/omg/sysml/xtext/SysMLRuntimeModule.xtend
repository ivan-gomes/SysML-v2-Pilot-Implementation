/*
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.xtext

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.omg.sysml.xtext.library.SysMLLibraryProvider
import org.omg.sysml.xtext.naming.SysMLQualifiedNameConverter
import org.omg.sysml.lang.sysml.util.IModelLibraryProvider
import org.omg.sysml.xtext.scoping.SysMLGlobalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class SysMLRuntimeModule extends AbstractSysMLRuntimeModule {
	
	def Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		SysMLQualifiedNameConverter
	}
	
	def Class<? extends IModelLibraryProvider> bindIModelLLibraryProvider() {
		SysMLLibraryProvider
	}
		
	override Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		SysMLGlobalScopeProvider
	}
		
}
