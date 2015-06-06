/*
 * generated by Xtext
 */
package org.uqbar.paco.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.uqbar.paco.dsl.ui.internal.TortugaDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TortugaDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TortugaDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TortugaDSLActivator.getInstance().getInjector(TortugaDSLActivator.ORG_UQBAR_PACO_DSL_TORTUGADSL);
	}
	
}
