package designPatternTest.buildMode.impl.itemImpl.street;

import designPatternTest.buildMode.abstractTest.Street;

/**
 * @date 2022年03月15日17:43
 */
public class Street2 extends Street {
    @Override
    public String name() {
        return "大鸡腿";
    }

    @Override
    public float price() {
        return 0.3f;
    }
}
