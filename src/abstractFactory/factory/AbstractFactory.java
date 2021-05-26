package abstractFactory.factory;

import abstractFactory.face.Color;
import abstractFactory.face.Shape;

/**
 * 抽象工厂
 * @date 2021年05月26日14:26
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
