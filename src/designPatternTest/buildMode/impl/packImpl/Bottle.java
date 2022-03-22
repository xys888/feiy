package designPatternTest.buildMode.impl.packImpl;

import designPattern.buildMode.face.Packing;

/**
 * @date 2022年03月15日17:45
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶装";
    }
}
