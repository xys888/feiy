package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.face.Color;
import designPattern.abstractFactory.face.Shape;
import designPattern.abstractFactory.shape.Circle;
import designPattern.abstractFactory.shape.Rectangle;
import designPattern.abstractFactory.shape.Square;

/**
 * 扩展抽象工厂
 *
 * @author xys
 * @date 2021年05月26日14:28
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
