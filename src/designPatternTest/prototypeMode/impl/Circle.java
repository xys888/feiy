package designPatternTest.prototypeMode.impl;

import designPatternTest.prototypeMode.Shape;

/**
 * @date 2022年03月15日16:43
 */
public class Circle extends Shape {
    public Circle() {
        type = "圆形";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
