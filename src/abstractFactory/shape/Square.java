package abstractFactory.shape;

import abstractFactory.face.Shape;

/**
 * @date 2021年05月26日14:21
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是正方形。。。");
    }
}
