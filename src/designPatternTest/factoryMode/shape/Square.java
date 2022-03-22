package designPatternTest.factoryMode.shape;

import designPattern.factoryMode.face.Shape;

/**
 * @date 2022年03月15日17:16
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是正方形");
    }
}
