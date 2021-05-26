package abstractFactory.shape;

import abstractFactory.face.Shape;

/**
 * @date 2021年05月26日14:22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是圆形。。。");
    }
}
