package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.color.Blue;
import designPattern.abstractFactory.color.Green;
import designPattern.abstractFactory.color.Red;
import designPattern.abstractFactory.face.Color;
import designPattern.abstractFactory.face.Shape;

/**
 * @author xys
 * @date 2021年05月26日14:31
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
