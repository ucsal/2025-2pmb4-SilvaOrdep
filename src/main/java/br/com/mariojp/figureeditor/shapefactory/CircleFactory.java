package br.com.mariojp.figureeditor.shapefactory;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape getShape(double x, double y, double width, double height) {
        double size = Math.max(Math.min(width, height), 10);
        return new Ellipse2D.Double(x,y,size,size);
    }

}
