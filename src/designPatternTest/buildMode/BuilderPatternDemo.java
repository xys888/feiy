package designPatternTest.buildMode;

/**
 * @date 2022年03月15日17:59
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuild mealBuild = new MealBuild();
        Meal meal = mealBuild.test1();
        System.out.println("套餐一");
        meal.showItems();
        System.out.println("总价值"+meal.getCost());

        Meal meal2 = mealBuild.test2();
        System.out.println("套餐二");
        meal2.showItems();
        System.out.println("总价值"+meal2.getCost());

        Meal meal3 = mealBuild.test3();
        System.out.println("套餐三");
        meal3.showItems();
        System.out.println("总价值"+meal3.getCost());

        Meal meal4 = mealBuild.test4();
        System.out.println("套餐四");
        meal4.showItems();
        System.out.println("总价值"+meal4.getCost());

        Meal meal5 = mealBuild.test5();
        System.out.println("套餐五");
        meal5.showItems();
        System.out.println("总价值"+meal5.getCost());

        Meal meal6 = mealBuild.test6();
        System.out.println("套餐六");
        meal6.showItems();
        System.out.println("总价值"+meal6.getCost());

        Meal meal7 = mealBuild.test7();
        System.out.println("套餐七");
        meal7.showItems();
        System.out.println("总价值"+meal7.getCost());

    }
}
