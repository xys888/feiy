package designPattern.buildMode.impl.itemInfos.street;

import designPattern.buildMode.abstractTest.Street;

/**
 * @date 2021年05月27日15:32
 */
public class StreetFoot extends Street {
    @Override
    public String name() {
        return "草莓派";
    }

    @Override
    public float price() {
        return 23.90f;
    }
}
