package org.swhite.tortue;

import java.awt.RenderingHints;

/**
 * Adds antialiases
 * Repaint on each forward (to make it smooth)
 * 
 * @author jfernandes
 */
public class CustomTortueCanvas extends org.swhite.tortue.TortueCanvas {
	
	@Override
	public void clear() {
		super.clear();
		// Anti-alias!
		offGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}
	
	@Override
	public void forward(int distance) {
		super.forward(distance);
		this.repaint();
	}
}
