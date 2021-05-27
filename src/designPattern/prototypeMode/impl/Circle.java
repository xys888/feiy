package designPattern.prototypeMode.impl;

import designPattern.prototypeMode.Shape;

/**
 * 第二步
 *
 * @author xys
 * @date 2021年05月27日16:14
 */
public class Circle extends Shape {
    public Circle() {
        type = "圆形";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
