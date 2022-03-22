package designPatternTest.buildMode.abstractTest;

import designPattern.buildMode.face.Item;
import designPattern.buildMode.face.Packing;
import designPattern.buildMode.impl.paceImpl.Bottle;


public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
