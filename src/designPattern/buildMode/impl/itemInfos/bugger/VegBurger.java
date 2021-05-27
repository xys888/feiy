package designPattern.buildMode.impl.itemInfos.bugger;

import designPattern.buildMode.abstractTest.Burger;

/**
 * @date 2021年05月27日15:17
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 12.6f;
    }
}
