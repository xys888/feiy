package designPatternTest.factoryMode;

import designPattern.factoryMode.face.Shape;

/**
 * @date 2022年03月15日17:20
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getInfo("circle").draw();
        shapeFactory.getInfo("rectangle").draw();
        shapeFactory.getInfo("square").draw();
    }
}
