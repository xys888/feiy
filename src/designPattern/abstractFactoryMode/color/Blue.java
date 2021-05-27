package designPattern.abstractFactoryMode.color;

import designPattern.abstractFactoryMode.face.Color;

/**
 * 第二步
 * @author xys
 * @date 2021年05月26日14:25
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("这是蓝色。。。");
    }
}
