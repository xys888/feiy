package designPattern.prototypeMode.impl;

import designPattern.prototypeMode.Shape;

/**
 * 第二步
 *
 * @author xys
 * @date 2021年05月27日16:14
 */
public class Square extends Shape {
    public Square() {
        type = "方形";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
