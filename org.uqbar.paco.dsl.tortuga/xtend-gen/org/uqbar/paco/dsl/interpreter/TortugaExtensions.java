package org.uqbar.paco.dsl.interpreter;

import com.google.common.base.Objects;
import java.awt.Color;
import org.swhite.tortue.TortueCanvas;

/**
 * @author jfernandes
 */
@SuppressWarnings("all")
public class TortugaExtensions {
  public Color toColorObject(final String colorName) {
    Color _switchResult = null;
    String _upperCase = colorName.toUpperCase();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_upperCase, "BLACK")) {
        _matched=true;
        _switchResult = Color.BLACK;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "BLUE")) {
        _matched=true;
        _switchResult = Color.BLUE;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "CYAN")) {
        _matched=true;
        _switchResult = Color.CYAN;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "DARK GRAY")) {
        _matched=true;
        _switchResult = Color.DARK_GRAY;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "GRAY")) {
        _matched=true;
        _switchResult = Color.GRAY;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "GREEN")) {
        _matched=true;
        _switchResult = Color.GREEN;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "LIGHTGRAY")) {
        _matched=true;
        _switchResult = Color.LIGHT_GRAY;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "MAGENTA")) {
        _matched=true;
        _switchResult = Color.MAGENTA;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "ORANGE")) {
        _matched=true;
        _switchResult = Color.ORANGE;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "PINK")) {
        _matched=true;
        _switchResult = Color.PINK;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "RED")) {
        _matched=true;
        _switchResult = Color.RED;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "WHITE")) {
        _matched=true;
        _switchResult = Color.WHITE;
      }
    }
    if (!_matched) {
      if (Objects.equal(_upperCase, "YELLOW")) {
        _matched=true;
        _switchResult = Color.YELLOW;
      }
    }
    return _switchResult;
  }
  
  public void penColor(final TortueCanvas canvas, final Color color) {
    int _red = color.getRed();
    Integer _max = this.max(Integer.valueOf(_red), Integer.valueOf(255));
    int _green = color.getGreen();
    Integer _max_1 = this.max(Integer.valueOf(_green), Integer.valueOf(255));
    int _blue = color.getBlue();
    Integer _max_2 = this.max(Integer.valueOf(_blue), Integer.valueOf(255));
    int _alpha = color.getAlpha();
    Integer _max_3 = this.max(Integer.valueOf(_alpha), Integer.valueOf(255));
    canvas.pencolor((_max).intValue(), (_max_1).intValue(), (_max_2).intValue(), (_max_3).intValue());
  }
  
  public void canvasColor(final TortueCanvas canvas, final Color color) {
    int _red = color.getRed();
    Integer _max = this.max(Integer.valueOf(_red), Integer.valueOf(255));
    int _green = color.getGreen();
    Integer _max_1 = this.max(Integer.valueOf(_green), Integer.valueOf(255));
    int _blue = color.getBlue();
    Integer _max_2 = this.max(Integer.valueOf(_blue), Integer.valueOf(255));
    canvas.canvascolor((_max).intValue(), (_max_1).intValue(), (_max_2).intValue());
  }
  
  public Integer max(final Integer v, final Integer max) {
    Integer _xifexpression = null;
    boolean _greaterThan = (v.compareTo(max) > 0);
    if (_greaterThan) {
      _xifexpression = max;
    } else {
      _xifexpression = v;
    }
    return _xifexpression;
  }
}
