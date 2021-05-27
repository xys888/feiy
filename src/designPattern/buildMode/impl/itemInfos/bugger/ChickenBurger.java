package designPattern.buildMode.impl.itemInfos.bugger;

import designPattern.buildMode.abstractTest.Burger;

/**
 * @date 2021年05月27日15:18
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 30.8f;
    }
}
