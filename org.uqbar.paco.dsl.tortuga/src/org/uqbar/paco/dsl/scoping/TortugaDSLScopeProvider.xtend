/*
 * generated by Xtext
 */
package org.uqbar.paco.dsl.scoping

import org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF
import org.eclipse.emf.ecore.EReference
import org.uqbar.paco.dsl.tortugaDSL.TO
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.resource.EObjectDescription

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 */
class TortugaDSLScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
	
	def scope_VARIABLE_REF_toVar(VARIABLE_REF ref, EReference ereference) {
		val scope = delegateGetScope(ref, ereference)
		var container = ref.eContainer
		while( container != null) {
			if (container instanceof TO)
				return new SimpleScope(scope, (container as TO).parameters.map[p| EObjectDescription.create(p.name, p) ])
			else 
				container = container.eContainer
		}
		return scope
	}

}
