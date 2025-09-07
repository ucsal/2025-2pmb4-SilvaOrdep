package br.com.mariojp.figureeditor.shapefactory;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape getShape(double x, double y, double width, double height) {
        return new Rectangle2D.Double(x,y,Math.max(width, 10),Math.max(height, 10));
    }

}
