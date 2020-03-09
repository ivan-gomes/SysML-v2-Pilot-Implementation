package org.omg.sysml.xpect

import org.omg.sysml.xtext.SysMLRuntimeModule

class SysMLXpectRuntimeModule extends SysMLRuntimeModule {
	
	override bindIGlobalScopeProvider() {
		SysMLXpectGlobalScopeProvider
	}	
	
	override bindIModelLLibraryProvider() {
		SysMLXpectLibraryProvider
	}
		
}