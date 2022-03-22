package designPatternTest.buildMode;

import designPattern.buildMode.impl.itemInfos.bugger.VegBurger;
import designPattern.buildMode.impl.itemInfos.drink.Coke;
import designPattern.buildMode.impl.itemInfos.drink.Pepsi;
import designPatternTest.buildMode.impl.itemImpl.bugger.CheckBugger1;
import designPatternTest.buildMode.impl.itemImpl.bugger.CheckBugger2;
import designPatternTest.buildMode.impl.itemImpl.drink.drink1;
import designPatternTest.buildMode.impl.itemImpl.drink.drink2;
import designPatternTest.buildMode.impl.itemImpl.drink.drink3;
import designPatternTest.buildMode.impl.itemImpl.street.Street1;
import designPatternTest.buildMode.impl.itemImpl.street.Street2;

/**
 * @date 2022年03月15日17:55
 */
public class MealBuild {

    public Meal test1(){
         Meal meal = new Meal();
        meal.addItem(new CheckBugger1());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal test2(){
        Meal meal = new Meal();
        meal.addItem(new CheckBugger2());
        meal.addItem(new drink3());
        return meal;
    }
    public Meal test3(){
        Meal meal = new Meal();
        meal.addItem(new CheckBugger2());
        meal.addItem(new drink2());
        return meal;
    }
    public Meal test4(){
        Meal meal = new Meal();
        meal.addItem(new CheckBugger1());
        meal.addItem(new drink1());
        return meal;
    }
    public Meal test5(){
        Meal meal = new Meal();
        meal.addItem(new Street1());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal test6(){
        Meal meal = new Meal();
        meal.addItem(new Street1());
        meal.addItem(new drink1());
        return meal;
    }
    public Meal test7(){
        Meal meal = new Meal();
        meal.addItem(new Street2());
        meal.addItem(new drink2());
        return meal;
    }
}
