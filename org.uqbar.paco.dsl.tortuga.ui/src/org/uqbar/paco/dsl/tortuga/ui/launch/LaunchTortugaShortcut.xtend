package org.uqbar.paco.dsl.tortuga.ui.launch

import com.google.inject.Inject
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.part.FileEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
import org.uqbar.paco.dsl.interpreter.TortugaInterpreter
import org.uqbar.paco.dsl.tortuga.ui.views.TortugaView
import org.uqbar.paco.dsl.tortugaDSL.TortugaProgram

/**
 * 
 * @author jfernandes
 */
class LaunchTortugaShortcut implements ILaunchShortcut {
	@Inject
	private IResourceForEditorInputFactory resourceFactory;
	
	override launch(ISelection selection, String mode) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override launch(IEditorPart editor, String mode) {
		val input = editor.editorInput
				
		if (editor instanceof XtextEditor && input instanceof FileEditorInput) {
			val resource = resourceFactory.createResource(input)
			resource.load(newHashMap())
			val program = resource.contents.head as TortugaProgram
			new TortugaInterpreter(canvas).exec(program)
		}
	}
	
	def getCanvas() {
		TortugaView.getInstance.canvas
	}
	
}