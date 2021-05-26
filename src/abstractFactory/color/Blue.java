package abstractFactory.color;

import abstractFactory.face.Color;

/**
 * @date 2021年05月26日14:25
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("这是蓝色。。。");
    }
}
