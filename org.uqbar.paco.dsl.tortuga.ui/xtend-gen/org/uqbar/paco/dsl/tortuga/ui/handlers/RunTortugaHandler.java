package org.uqbar.paco.dsl.tortuga.ui.handlers;

import com.google.inject.Inject;
import java.util.HashMap;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.swhite.tortue.TortueCanvas;
import org.uqbar.paco.dsl.interpreter.TortugaInterpreter;
import org.uqbar.paco.dsl.tortuga.ui.views.TortugaView;
import org.uqbar.paco.dsl.tortugaDSL.TortugaProgram;

/**
 * Ejecuta el interprete sobre el archivo activo en el editor.
 * 
 * @author jfernandes
 */
@SuppressWarnings("all")
public class RunTortugaHandler extends AbstractHandler {
  @Inject
  private IResourceForEditorInputFactory resourceFactory;
  
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      Object _xblockexpression = null;
      {
        final IEditorPart editorPart = HandlerUtil.getActiveEditor(event);
        final IEditorInput input = editorPart.getEditorInput();
        boolean _and = false;
        if (!(editorPart instanceof XtextEditor)) {
          _and = false;
        } else {
          _and = (input instanceof FileEditorInput);
        }
        if (_and) {
          final Resource resource = this.resourceFactory.createResource(input);
          HashMap<Object, Object> _newHashMap = CollectionLiterals.<Object, Object>newHashMap();
          resource.load(_newHashMap);
          EList<EObject> _contents = resource.getContents();
          EObject _head = IterableExtensions.<EObject>head(_contents);
          final TortugaProgram program = ((TortugaProgram) _head);
          TortueCanvas _canvas = this.getCanvas();
          TortugaInterpreter _tortugaInterpreter = new TortugaInterpreter(_canvas);
          _tortugaInterpreter.exec(program);
        }
        _xblockexpression = null;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public TortueCanvas getCanvas() {
    TortugaView _instance = TortugaView.getInstance();
    return _instance.getCanvas();
  }
}
