package org.uqbar.paco.dsl.interpreter;

import com.google.common.base.Objects;
import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.swhite.tortue.TortueCanvas;
import org.uqbar.paco.dsl.interpreter.TortugaExtensions;
import org.uqbar.paco.dsl.tortugaDSL.BOLD;
import org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION;
import org.uqbar.paco.dsl.tortugaDSL.CANVAS_COLOR;
import org.uqbar.paco.dsl.tortugaDSL.CLEAR;
import org.uqbar.paco.dsl.tortugaDSL.COLOREABLE;
import org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC;
import org.uqbar.paco.dsl.tortugaDSL.DIVIDE;
import org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING;
import org.uqbar.paco.dsl.tortugaDSL.EQUALS;
import org.uqbar.paco.dsl.tortugaDSL.EXPRESSION;
import org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE;
import org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE;
import org.uqbar.paco.dsl.tortugaDSL.FORWARD;
import org.uqbar.paco.dsl.tortugaDSL.FontStyleValues;
import org.uqbar.paco.dsl.tortugaDSL.GREATER_THAN;
import org.uqbar.paco.dsl.tortugaDSL.HOME;
import org.uqbar.paco.dsl.tortugaDSL.IF;
import org.uqbar.paco.dsl.tortugaDSL.ITALIC;
import org.uqbar.paco.dsl.tortugaDSL.LEFT;
import org.uqbar.paco.dsl.tortugaDSL.LESSER_THAN;
import org.uqbar.paco.dsl.tortugaDSL.MAKE;
import org.uqbar.paco.dsl.tortugaDSL.MULTIPLY;
import org.uqbar.paco.dsl.tortugaDSL.OPERATION;
import org.uqbar.paco.dsl.tortugaDSL.PARAM;
import org.uqbar.paco.dsl.tortugaDSL.PENCOLOR;
import org.uqbar.paco.dsl.tortugaDSL.PENDOWN;
import org.uqbar.paco.dsl.tortugaDSL.PENUP;
import org.uqbar.paco.dsl.tortugaDSL.PLAIN;
import org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL;
import org.uqbar.paco.dsl.tortugaDSL.REFERENCIABLE;
import org.uqbar.paco.dsl.tortugaDSL.REPEAT;
import org.uqbar.paco.dsl.tortugaDSL.RIGHT;
import org.uqbar.paco.dsl.tortugaDSL.SENTENCE;
import org.uqbar.paco.dsl.tortugaDSL.SET_X;
import org.uqbar.paco.dsl.tortugaDSL.SET_Y;
import org.uqbar.paco.dsl.tortugaDSL.SUBTRACT;
import org.uqbar.paco.dsl.tortugaDSL.SUM;
import org.uqbar.paco.dsl.tortugaDSL.TO;
import org.uqbar.paco.dsl.tortugaDSL.TortugaDSLFactory;
import org.uqbar.paco.dsl.tortugaDSL.TortugaProgram;
import org.uqbar.paco.dsl.tortugaDSL.VALUE;
import org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF;

/**
 * Interprete del modélo semantico para su ejecución.
 * Implementa el comportamiento como extension methods a las clases del modelo.
 * Convierte en "ejecutables" a todas las sentencias, y en "evaluables"
 * a todas las expresiones.
 * 
 * @author jfernandes
 */
@SuppressWarnings("all")
public class TortugaInterpreter {
  @Extension
  private TortugaExtensions extensions = new TortugaExtensions();
  
  private TortueCanvas canvas;
  
  private Stack<Map<PARAM, Double>> stack = new Stack<Map<PARAM, Double>>();
  
  public TortugaInterpreter(final TortueCanvas canvas) {
    this.canvas = canvas;
  }
  
  protected void _exec(final TortugaProgram p) {
    this.canvas.newCommand();
    EList<SENTENCE> _sentences = p.getSentences();
    final Procedure1<SENTENCE> _function = new Procedure1<SENTENCE>() {
      public void apply(final SENTENCE s) {
        TortugaInterpreter.this.exec(s);
        TortugaInterpreter.this.canvas.repaint();
      }
    };
    IterableExtensions.<SENTENCE>forEach(_sentences, _function);
  }
  
  protected void _exec(final SENTENCE s) {
    throw new UnsupportedOperationException(("ERROR !!! No implementado para: " + s));
  }
  
  protected void _exec(final MAKE m) {
    EXPRESSION _value = m.getValue();
    Double _evaluate = this.evaluate(_value);
    VALUE _asValue = this.asValue(_evaluate);
    m.setValue(_asValue);
  }
  
  protected void _exec(final LEFT l) {
    EXPRESSION _amount = l.getAmount();
    Double _evaluate = this.evaluate(_amount);
    this.canvas.left((_evaluate).doubleValue());
  }
  
  protected void _exec(final RIGHT r) {
    EXPRESSION _amount = r.getAmount();
    Double _evaluate = this.evaluate(_amount);
    this.canvas.right((_evaluate).doubleValue());
  }
  
  protected void _exec(final FORWARD f) {
    EXPRESSION _amount = f.getAmount();
    Double _evaluate = this.evaluate(_amount);
    int _intValue = _evaluate.intValue();
    this.canvas.forward(_intValue);
  }
  
  protected void _exec(final SET_X s) {
    EXPRESSION _amount = s.getAmount();
    Double _evaluate = this.evaluate(_amount);
    int _intValue = _evaluate.intValue();
    this.canvas.setX(_intValue);
  }
  
  protected void _exec(final SET_Y s) {
    EXPRESSION _amount = s.getAmount();
    Double _evaluate = this.evaluate(_amount);
    int _intValue = _evaluate.intValue();
    this.canvas.setY(_intValue);
  }
  
  protected void _exec(final PENDOWN r) {
    this.canvas.penDown();
  }
  
  protected void _exec(final PENUP r) {
    this.canvas.penUp();
  }
  
  protected void _exec(final PENCOLOR coloreable) {
    Color _colorObject = this.colorObject(coloreable);
    this.extensions.penColor(this.canvas, _colorObject);
  }
  
  protected void _exec(final CANVAS_COLOR coloreable) {
    Color _colorObject = this.colorObject(coloreable);
    this.extensions.canvasColor(this.canvas, _colorObject);
  }
  
  protected void _exec(final HOME h) {
    this.canvas.home();
  }
  
  protected void _exec(final CLEAR c) {
    this.canvas.clear();
  }
  
  protected void _exec(final FONT_SIZE c) {
    EXPRESSION _size = c.getSize();
    Double _evaluate = this.evaluate(_size);
    int _intValue = _evaluate.intValue();
    this.canvas.fontSize(_intValue);
  }
  
  protected void _exec(final FONT_STYLE c) {
    FontStyleValues _style = c.getStyle();
    int _asTortueInt = this.asTortueInt(_style);
    this.canvas.fontStyle(_asTortueInt);
  }
  
  protected int _asTortueInt(final BOLD n) {
    return 1;
  }
  
  protected int _asTortueInt(final ITALIC n) {
    return 2;
  }
  
  protected int _asTortueInt(final PLAIN n) {
    return 0;
  }
  
  protected void _exec(final DRAW_STRING string) {
    String _text = string.getText();
    this.canvas.drawString(_text);
  }
  
  protected void _exec(final REPEAT r) {
    EXPRESSION _times = r.getTimes();
    Double _evaluate = this.evaluate(_times);
    int _intValue = _evaluate.intValue();
    IntegerRange _upTo = new IntegerRange(1, _intValue);
    final Procedure1<Integer> _function = new Procedure1<Integer>() {
      public void apply(final Integer it) {
        EList<SENTENCE> _commands = r.getCommands();
        final Procedure1<SENTENCE> _function = new Procedure1<SENTENCE>() {
          public void apply(final SENTENCE c) {
            TortugaInterpreter.this.exec(c);
          }
        };
        IterableExtensions.<SENTENCE>forEach(_commands, _function);
      }
    };
    IterableExtensions.<Integer>forEach(_upTo, _function);
  }
  
  protected void _exec(final TO t) {
  }
  
  protected void _exec(final PROCEDURE_CALL call) {
    Map<PARAM, Double> _createContext = this.createContext(call);
    this.stack.push(_createContext);
    TO _to = call.getTo();
    EList<SENTENCE> _commands = _to.getCommands();
    final Procedure1<SENTENCE> _function = new Procedure1<SENTENCE>() {
      public void apply(final SENTENCE c) {
        TortugaInterpreter.this.exec(c);
      }
    };
    IterableExtensions.<SENTENCE>forEach(_commands, _function);
    this.stack.pop();
  }
  
  public Map<PARAM, Double> createContext(final PROCEDURE_CALL call) {
    HashMap<PARAM, Double> _xblockexpression = null;
    {
      final HashMap<PARAM, Double> map = CollectionLiterals.<PARAM, Double>newHashMap();
      EList<EXPRESSION> _params = call.getParams();
      final Procedure2<EXPRESSION, Integer> _function = new Procedure2<EXPRESSION, Integer>() {
        public void apply(final EXPRESSION p, final Integer i) {
          TO _to = call.getTo();
          EList<PARAM> _parameters = _to.getParameters();
          PARAM _get = _parameters.get((i).intValue());
          Double _evaluate = TortugaInterpreter.this.evaluate(p);
          map.put(_get, _evaluate);
        }
      };
      IterableExtensions.<EXPRESSION>forEach(_params, _function);
      _xblockexpression = map;
    }
    return _xblockexpression;
  }
  
  protected void _exec(final IF bif) {
    BOOLEAN_EXPRESSION _condition = bif.getCondition();
    boolean _evalBool = this.evalBool(_condition);
    if (_evalBool) {
      EList<SENTENCE> _commands = bif.getCommands();
      final Procedure1<SENTENCE> _function = new Procedure1<SENTENCE>() {
        public void apply(final SENTENCE c) {
          TortugaInterpreter.this.exec(c);
        }
      };
      IterableExtensions.<SENTENCE>forEach(_commands, _function);
    }
  }
  
  protected void _exec(final SUM s) {
    final Function2<Double, Double, Double> _function = new Function2<Double, Double, Double>() {
      public Double apply(final Double a, final Double b) {
        return Double.valueOf(DoubleExtensions.operator_plus(a, b));
      }
    };
    this.updateVar(s, _function);
  }
  
  protected void _exec(final DIVIDE s) {
    final Function2<Double, Double, Double> _function = new Function2<Double, Double, Double>() {
      public Double apply(final Double a, final Double b) {
        return Double.valueOf(DoubleExtensions.operator_divide(a, b));
      }
    };
    this.updateVar(s, _function);
  }
  
  protected void _exec(final MULTIPLY s) {
    final Function2<Double, Double, Double> _function = new Function2<Double, Double, Double>() {
      public Double apply(final Double a, final Double b) {
        return Double.valueOf(DoubleExtensions.operator_multiply(a, b));
      }
    };
    this.updateVar(s, _function);
  }
  
  protected void _exec(final SUBTRACT s) {
    final Function2<Double, Double, Double> _function = new Function2<Double, Double, Double>() {
      public Double apply(final Double a, final Double b) {
        return Double.valueOf(DoubleExtensions.operator_minus(a, b));
      }
    };
    this.updateVar(s, _function);
  }
  
  public void updateVar(final OPERATION s, final Function2<? super Double, ? super Double, ? extends Double> function) {
    MAKE _targetVariable = s.getTargetVariable();
    EXPRESSION _valOne = s.getValOne();
    Double _evaluate = this.evaluate(_valOne);
    EXPRESSION _valTwo = s.getValTwo();
    Double _evaluate_1 = this.evaluate(_valTwo);
    Double _apply = function.apply(_evaluate, _evaluate_1);
    VALUE _asValue = this.asValue(_apply);
    _targetVariable.setValue(_asValue);
  }
  
  protected boolean _evalBool(final EQUALS e) {
    EXPRESSION _op1 = e.getOp1();
    Double _evaluate = this.evaluate(_op1);
    EXPRESSION _op2 = e.getOp2();
    Double _evaluate_1 = this.evaluate(_op2);
    return Objects.equal(_evaluate, _evaluate_1);
  }
  
  protected boolean _evalBool(final GREATER_THAN e) {
    EXPRESSION _op1 = e.getOp1();
    Double _evaluate = this.evaluate(_op1);
    EXPRESSION _op2 = e.getOp2();
    Double _evaluate_1 = this.evaluate(_op2);
    return (_evaluate.compareTo(_evaluate_1) > 0);
  }
  
  protected boolean _evalBool(final LESSER_THAN e) {
    EXPRESSION _op1 = e.getOp1();
    Double _evaluate = this.evaluate(_op1);
    EXPRESSION _op2 = e.getOp2();
    Double _evaluate_1 = this.evaluate(_op2);
    return (_evaluate.compareTo(_evaluate_1) < 0);
  }
  
  protected Double _evaluate(final VALUE v) {
    return Double.valueOf(v.getVal());
  }
  
  protected Double _evaluate(final VARIABLE_REF r) {
    REFERENCIABLE _toVar = r.getToVar();
    return this.evaluate(_toVar);
  }
  
  protected Double _evaluate(final MAKE m) {
    EXPRESSION _value = m.getValue();
    return this.evaluate(_value);
  }
  
  protected Double _evaluate(final PARAM p) {
    Map<PARAM, Double> _peek = this.stack.peek();
    return _peek.get(p);
  }
  
  public VALUE asValue(final Double i) {
    VALUE _xblockexpression = null;
    {
      final VALUE v = TortugaDSLFactory.eINSTANCE.createVALUE();
      v.setVal((i).doubleValue());
      _xblockexpression = v;
    }
    return _xblockexpression;
  }
  
  public Color toColorObject(final COLOR_SPEC spec) {
    EXPRESSION _red = spec.getRed();
    Double _evaluate = this.evaluate(_red);
    int _intValue = _evaluate.intValue();
    EXPRESSION _green = spec.getGreen();
    Double _evaluate_1 = this.evaluate(_green);
    int _intValue_1 = _evaluate_1.intValue();
    EXPRESSION _blue = spec.getBlue();
    Double _evaluate_2 = this.evaluate(_blue);
    int _intValue_2 = _evaluate_2.intValue();
    EXPRESSION _alpha = spec.getAlpha();
    Double _evaluate_3 = this.evaluate(_alpha);
    int _intValue_3 = _evaluate_3.intValue();
    return new Color(_intValue, _intValue_1, _intValue_2, _intValue_3);
  }
  
  public Color colorObject(final COLOREABLE coloreable) {
    Color _xifexpression = null;
    String _color = coloreable.getColor();
    boolean _notEquals = (!Objects.equal(_color, null));
    if (_notEquals) {
      String _color_1 = coloreable.getColor();
      _xifexpression = this.extensions.toColorObject(_color_1);
    } else {
      COLOR_SPEC _colorSpec = coloreable.getColorSpec();
      _xifexpression = this.toColorObject(_colorSpec);
    }
    return _xifexpression;
  }
  
  public void exec(final EObject coloreable) {
    if (coloreable instanceof CANVAS_COLOR) {
      _exec((CANVAS_COLOR)coloreable);
      return;
    } else if (coloreable instanceof FONT_SIZE) {
      _exec((FONT_SIZE)coloreable);
      return;
    } else if (coloreable instanceof FONT_STYLE) {
      _exec((FONT_STYLE)coloreable);
      return;
    } else if (coloreable instanceof PENCOLOR) {
      _exec((PENCOLOR)coloreable);
      return;
    } else if (coloreable instanceof CLEAR) {
      _exec((CLEAR)coloreable);
      return;
    } else if (coloreable instanceof DIVIDE) {
      _exec((DIVIDE)coloreable);
      return;
    } else if (coloreable instanceof DRAW_STRING) {
      _exec((DRAW_STRING)coloreable);
      return;
    } else if (coloreable instanceof FORWARD) {
      _exec((FORWARD)coloreable);
      return;
    } else if (coloreable instanceof HOME) {
      _exec((HOME)coloreable);
      return;
    } else if (coloreable instanceof IF) {
      _exec((IF)coloreable);
      return;
    } else if (coloreable instanceof LEFT) {
      _exec((LEFT)coloreable);
      return;
    } else if (coloreable instanceof MULTIPLY) {
      _exec((MULTIPLY)coloreable);
      return;
    } else if (coloreable instanceof PENDOWN) {
      _exec((PENDOWN)coloreable);
      return;
    } else if (coloreable instanceof PENUP) {
      _exec((PENUP)coloreable);
      return;
    } else if (coloreable instanceof REPEAT) {
      _exec((REPEAT)coloreable);
      return;
    } else if (coloreable instanceof RIGHT) {
      _exec((RIGHT)coloreable);
      return;
    } else if (coloreable instanceof SET_X) {
      _exec((SET_X)coloreable);
      return;
    } else if (coloreable instanceof SET_Y) {
      _exec((SET_Y)coloreable);
      return;
    } else if (coloreable instanceof SUBTRACT) {
      _exec((SUBTRACT)coloreable);
      return;
    } else if (coloreable instanceof SUM) {
      _exec((SUM)coloreable);
      return;
    } else if (coloreable instanceof TO) {
      _exec((TO)coloreable);
      return;
    } else if (coloreable instanceof MAKE) {
      _exec((MAKE)coloreable);
      return;
    } else if (coloreable instanceof PROCEDURE_CALL) {
      _exec((PROCEDURE_CALL)coloreable);
      return;
    } else if (coloreable instanceof SENTENCE) {
      _exec((SENTENCE)coloreable);
      return;
    } else if (coloreable instanceof TortugaProgram) {
      _exec((TortugaProgram)coloreable);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(coloreable).toString());
    }
  }
  
  public int asTortueInt(final FontStyleValues n) {
    if (n instanceof BOLD) {
      return _asTortueInt((BOLD)n);
    } else if (n instanceof ITALIC) {
      return _asTortueInt((ITALIC)n);
    } else if (n instanceof PLAIN) {
      return _asTortueInt((PLAIN)n);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(n).toString());
    }
  }
  
  public boolean evalBool(final BOOLEAN_EXPRESSION e) {
    if (e instanceof EQUALS) {
      return _evalBool((EQUALS)e);
    } else if (e instanceof GREATER_THAN) {
      return _evalBool((GREATER_THAN)e);
    } else if (e instanceof LESSER_THAN) {
      return _evalBool((LESSER_THAN)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public Double evaluate(final EObject m) {
    if (m instanceof MAKE) {
      return _evaluate((MAKE)m);
    } else if (m instanceof PARAM) {
      return _evaluate((PARAM)m);
    } else if (m instanceof VALUE) {
      return _evaluate((VALUE)m);
    } else if (m instanceof VARIABLE_REF) {
      return _evaluate((VARIABLE_REF)m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m).toString());
    }
  }
}
