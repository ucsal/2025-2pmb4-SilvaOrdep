package br.com.mariojp.figureeditor.shapefactory;

import java.awt.*;

public interface ShapeFactory {

    Shape getShape(double x, double y, double width, double height);

}
