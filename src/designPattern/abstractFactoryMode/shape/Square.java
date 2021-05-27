package designPattern.abstractFactoryMode.shape;

import designPattern.abstractFactoryMode.face.Shape;

/**
 * 第二步
 * @author xys
 * @date 2021年05月26日14:21
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是正方形。。。");
    }
}
