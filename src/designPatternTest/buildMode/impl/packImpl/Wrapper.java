package designPatternTest.buildMode.impl.packImpl;

import designPatternTest.buildMode.face.Packing;

/**
 * @date 2022年03月15日17:46
 */
public class Wrapper implements Packing {
    @Override
    public String pick() {
        return "纸类";
    }
}
