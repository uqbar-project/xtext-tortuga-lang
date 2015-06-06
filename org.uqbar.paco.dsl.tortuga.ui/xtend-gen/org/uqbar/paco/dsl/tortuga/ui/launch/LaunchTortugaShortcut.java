package org.uqbar.paco.dsl.tortuga.ui.launch;

import com.google.inject.Inject;
import java.util.HashMap;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
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
 * @author jfernandes
 */
@SuppressWarnings("all")
public class LaunchTortugaShortcut implements ILaunchShortcut {
  @Inject
  private IResourceForEditorInputFactory resourceFactory;
  
  public void launch(final ISelection selection, final String mode) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void launch(final IEditorPart editor, final String mode) {
    try {
      final IEditorInput input = editor.getEditorInput();
      boolean _and = false;
      if (!(editor instanceof XtextEditor)) {
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public TortueCanvas getCanvas() {
    TortugaView _instance = TortugaView.getInstance();
    return _instance.getCanvas();
  }
}
