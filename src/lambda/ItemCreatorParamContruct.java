package lambda;

import designPattern.buildMode.face.Item;

/**
 * @date 2021年07月22日15:36
 */
public interface ItemCreatorParamContruct {
    Item getItem(int id, String name, double price);
}
