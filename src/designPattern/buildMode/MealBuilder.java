package designPattern.buildMode;

import designPattern.buildMode.impl.itemInfos.bugger.ChickenBurger;
import designPattern.buildMode.impl.itemInfos.bugger.VegBurger;
import designPattern.buildMode.impl.itemInfos.drink.Coke;
import designPattern.buildMode.impl.itemInfos.drink.Pepsi;
import designPattern.buildMode.impl.itemInfos.drink.StrawbBerry;
import designPattern.buildMode.impl.itemInfos.street.StreetFoot;

/**
 * 第五步
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象
 *
 * @author xys
 * @date 2021年05月27日15:22
 */
public class MealBuilder {
    /**
     * 素食套餐
     *
     * @return
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 肉食套餐
     *
     * @return
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    /**
     * 小吃套餐
     *
     * @return
     */
    public Meal prepareStreet() {
        Meal meal = new Meal();
        meal.addItem(new StreetFoot());
        meal.addItem(new Pepsi());
        return meal;
    }

    /**
     * 饮料套餐
     *
     * @return
     */
    public Meal prepareDrink() {
        Meal meal = new Meal();
        meal.addItem(new Pepsi());
        meal.addItem(new Coke());
        meal.addItem(new StrawbBerry());
        return meal;
    }
}
