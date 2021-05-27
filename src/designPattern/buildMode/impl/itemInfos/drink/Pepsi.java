package designPattern.buildMode.impl.itemInfos.drink;

import designPattern.buildMode.abstractTest.ColdDrink;

/**
 * @date 2021年05月27日15:20
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百世可乐";
    }

    @Override
    public float price() {
        return 45f;
    }
}
