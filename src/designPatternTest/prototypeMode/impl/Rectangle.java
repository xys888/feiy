package designPatternTest.prototypeMode.impl;

import designPatternTest.prototypeMode.Shape;

/**
 * @date 2022年03月15日16:45
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "矩形";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
