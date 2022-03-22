package designPatternTest.buildMode.impl.itemImpl.street;

import designPatternTest.buildMode.abstractTest.Street;

/**
 * @date 2022年03月15日17:42
 */
public class Street1 extends Street {
    @Override
    public String name() {
        return "洋葱卷";
    }

    @Override
    public float price() {
        return 10;
    }
}
