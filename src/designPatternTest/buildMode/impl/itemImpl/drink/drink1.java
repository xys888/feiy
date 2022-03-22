package designPatternTest.buildMode.impl.itemImpl.drink;

import designPatternTest.buildMode.abstractTest.ColdDrink;

/**
 * @date 2022年03月15日17:39
 */
public class drink1 extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 10f;
    }
}
