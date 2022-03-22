package designPatternTest.buildMode.impl.itemImpl.drink;

import designPatternTest.buildMode.abstractTest.ColdDrink;

/**
 * @date 2022年03月15日17:40
 */
public class drink2 extends ColdDrink {
    @Override
    public String name() {
        return "西瓜汁";
    }

    @Override
    public float price() {
        return 20;
    }
}
