package designPattern.factoryMode.shape;

import designPattern.factoryMode.face.Shape;

/**
 * @author xys
 * @date 2021年05月26日14:22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是圆形。。。");
    }
}
