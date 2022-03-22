package designPatternTest.buildMode.impl.itemImpl.drink;

import designPatternTest.buildMode.abstractTest.ColdDrink;

/**
 * @date 2022年03月15日17:40
 */
public class drink3 extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 10;
    }
}
