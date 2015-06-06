package org.uqbar.paco.dsl.tortuga.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.swhite.tortue.CustomTortueCanvas;
import org.swhite.tortue.TortueCanvas;

/**
 * 
 * @author jfernandes
 */
public class TortugaView extends ViewPart {
	public static final String ID = "org.uqbar.paco.dsl.tortuga.ui.views.TortugaView";
	private TortueCanvas tortuCanvas;
	private static TortugaView INSTANCE;
	
	public static TortugaView getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		INSTANCE = this;
	}
	
	public TortueCanvas getCanvas() {
		return tortuCanvas;
	}
	
	@Override
	public void dispose() {
		INSTANCE = null;
		super.dispose();
	}
	
	public void createPartControl(Composite parent) {
		FillLayout layout = new FillLayout();
		layout.type = SWT.VERTICAL;
		parent.setLayout(layout);
		Composite swtAwtComponent = new Composite(parent, SWT.EMBEDDED);
		swtAwtComponent.setBackground(new Color(parent.getDisplay(), 255,0, 0));
		java.awt.Frame frame = SWT_AWT.new_Frame(swtAwtComponent);
		tortuCanvas = createCanvas();
		tortuCanvas.showTurtle();
		frame.add(tortuCanvas);
	}

	protected TortueCanvas createCanvas() {
		return new CustomTortueCanvas();
	}

	@Override
	public void setFocus() {
	}

}