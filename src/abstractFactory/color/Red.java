package abstractFactory.color;

import abstractFactory.face.Color;

/**
 * @date 2021年05月26日14:24
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("这是红色。。。");
    }
}
