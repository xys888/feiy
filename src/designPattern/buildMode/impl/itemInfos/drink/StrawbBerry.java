package designPattern.buildMode.impl.itemInfos.drink;

import designPattern.buildMode.abstractTest.ColdDrink;

/**
 * @date 2021年05月27日15:45
 */
public class StrawbBerry extends ColdDrink {
    @Override
    public String name() {
        return "草莓汁";
    }

    @Override
    public float price() {
        return 30f;
    }
}
