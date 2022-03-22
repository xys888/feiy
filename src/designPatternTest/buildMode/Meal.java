package designPatternTest.buildMode;

import designPattern.buildMode.face.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022年03月15日17:48
 */
public class Meal {

    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item i:list){
            cost+=i.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item i:list){
            System.out.print("项目 : " + i.name());
            System.out.print(", 包装 : " + i.packing().pack());
            System.out.println(", 价格 : " + i.price());
        }
    }
}
