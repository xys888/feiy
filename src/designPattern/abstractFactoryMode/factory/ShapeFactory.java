package designPattern.abstractFactoryMode.factory;

import designPattern.abstractFactoryMode.face.Color;
import designPattern.abstractFactoryMode.face.Shape;
import designPattern.abstractFactoryMode.shape.Circle;
import designPattern.abstractFactoryMode.shape.Rectangle;
import designPattern.abstractFactoryMode.shape.Square;

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
