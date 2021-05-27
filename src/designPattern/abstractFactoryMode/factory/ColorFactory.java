package designPattern.abstractFactoryMode.factory;

import designPattern.abstractFactoryMode.color.Blue;
import designPattern.abstractFactoryMode.color.Green;
import designPattern.abstractFactoryMode.color.Red;
import designPattern.abstractFactoryMode.face.Color;
import designPattern.abstractFactoryMode.face.Shape;

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
