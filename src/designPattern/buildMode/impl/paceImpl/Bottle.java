package designPattern.buildMode.impl.paceImpl;

import designPattern.buildMode.face.Packing;

/**
 * 第二步
 * 实现包装类
 * 创建多种不同的包装方式
 *
 * @author xys
 * @date 2021年05月27日15:11
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶装 ";
    }
}
