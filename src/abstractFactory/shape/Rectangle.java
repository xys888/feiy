package abstractFactory.shape;

import abstractFactory.face.Shape;

/**
 * @date 2021年05月26日14:20
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是矩形。。。");
    }
}
