package designPatternTest.buildMode.impl.itemImpl.bugger;

import designPattern.buildMode.abstractTest.Burger;
import designPatternTest.buildMode.face.Item;

/**
 * @date 2022年03月15日17:33
 */
public class CheckBugger1 extends Burger {

    @Override
    public String name() {
        return "鸡肉堡";
    }

    @Override
    public float price() {
        return 12.09f;
    }
}
