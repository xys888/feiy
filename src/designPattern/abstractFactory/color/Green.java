package designPattern.abstractFactory.color;

import designPattern.abstractFactory.face.Color;

/**
 * @author xys
 * @date 2021年05月26日14:25
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("这是绿色。。。");
    }
}
