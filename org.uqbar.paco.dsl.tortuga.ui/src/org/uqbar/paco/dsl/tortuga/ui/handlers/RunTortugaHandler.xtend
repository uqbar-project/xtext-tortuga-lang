package org.uqbar.paco.dsl.tortuga.ui.handlers

import com.google.inject.Inject
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.part.FileEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
import org.uqbar.paco.dsl.interpreter.TortugaInterpreter
import org.uqbar.paco.dsl.tortuga.ui.views.TortugaView
import org.uqbar.paco.dsl.tortugaDSL.TortugaProgram

/**
 * Ejecuta el interprete sobre el archivo activo en el editor.
 * 
 * @author jfernandes
 */
//TODO: deshabilitar si no hay archivo .tortu abierto.
class RunTortugaHandler extends AbstractHandler {
	@Inject
	private IResourceForEditorInputFactory resourceFactory;
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val editorPart = HandlerUtil.getActiveEditor(event);
		val input = editorPart.editorInput
		
		if (editorPart instanceof XtextEditor && input instanceof FileEditorInput) {
			val resource = resourceFactory.createResource(input)
			resource.load(newHashMap())
			val program = resource.contents.head as TortugaProgram
			new TortugaInterpreter(canvas).exec(program)
		}
		null
	}
	
	def getCanvas() {
		TortugaView.getInstance.canvas
	}
	
}