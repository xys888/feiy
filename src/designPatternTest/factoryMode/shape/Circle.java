package designPatternTest.factoryMode.shape;

import designPattern.factoryMode.face.Shape;

/**
 * @date 2022年03月15日17:15
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是圆形");
    }
}
