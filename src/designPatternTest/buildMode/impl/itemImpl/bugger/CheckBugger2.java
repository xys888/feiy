package designPatternTest.buildMode.impl.itemImpl.bugger;

import designPattern.buildMode.abstractTest.Burger;

/**
 * @date 2022年03月15日17:37
 */
public class CheckBugger2 extends Burger {
    @Override
    public String name() {
        return "超级鸡肉堡";
    }

    @Override
    public float price() {
        return 23.99f;
    }
}
