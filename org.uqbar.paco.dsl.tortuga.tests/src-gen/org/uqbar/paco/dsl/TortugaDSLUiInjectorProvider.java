/*
* generated by Xtext
*/
package org.uqbar.paco.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TortugaDSLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.uqbar.paco.dsl.ui.internal.TortugaDSLActivator.getInstance().getInjector("org.uqbar.paco.dsl.TortugaDSL");
	}
	
}