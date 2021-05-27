package designPattern.buildMode;

import designPattern.buildMode.face.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 第四步
 * 创建套餐类
 *
 * @author xys
 * @date 2021年05月27日15:21
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    //添加多个套餐
    public void addItem(Item item) {
        items.add(item);
    }

    //得到总成本
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    //展示模板
    public void showItems() {
        for (Item item : items) {
            System.out.print("项目 : " + item.name());
            System.out.print(", 包装 : " + item.packing().pack());
            System.out.println(", 价格 : " + item.price());
        }
    }
}
