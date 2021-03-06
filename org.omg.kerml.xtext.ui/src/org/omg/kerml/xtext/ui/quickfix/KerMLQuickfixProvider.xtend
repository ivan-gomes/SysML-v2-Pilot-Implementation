/*
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.xtext.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import java.util.Collections
import org.eclipse.xtext.scoping.IScope

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class KerMLQuickfixProvider extends DefaultQuickfixProvider {

	override queryScope(IScope scope) {
		Collections.emptySet()
	}

//	@Fix(KerMLValidator.INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}
}
