package designPattern.prototypeMode.impl;

import designPattern.prototypeMode.Shape;

/**
 * 第二步
 *
 * @author xys
 * @date 2021年05月27日16:13
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "矩形";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
