package designPattern.factoryMode.shape;

import designPattern.factoryMode.face.Shape;

/**
 * @author xys
 * @date 2021年05月26日14:20
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是矩形。。。");
    }
}
