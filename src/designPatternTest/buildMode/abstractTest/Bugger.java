package designPatternTest.buildMode.abstractTest;

import designPattern.buildMode.face.Item;
import designPattern.buildMode.face.Packing;
import designPattern.buildMode.impl.paceImpl.Wrapper;

/**
 * @date 2022年03月15日17:35
 */
public abstract class Bugger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
