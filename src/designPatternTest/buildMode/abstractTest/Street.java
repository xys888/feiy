package designPatternTest.buildMode.abstractTest;

import designPattern.buildMode.face.Item;
import designPattern.buildMode.face.Packing;
import designPattern.buildMode.impl.paceImpl.Wrapper;

public abstract class Street implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
