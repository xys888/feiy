package designPattern.buildMode;

/**
 * 第七步
 * BuiderPatternDemo 使用 MealBuilder 来演示建造者模式（Builder Pattern）。
 *
 * @author xys
 * @date 2021年05月27日15:22
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素食餐");
        vegMeal.showItems();
        System.out.println("总成本: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("非素食餐");
        nonVegMeal.showItems();
        System.out.println("总成本: " + nonVegMeal.getCost());

        Meal meal = mealBuilder.prepareStreet();
        System.out.println("小吃套餐");
        meal.showItems();
        System.out.println("总成本: " + meal.getCost());

        Meal meal1 = mealBuilder.prepareDrink();
        System.out.println("饮料套餐");
        meal1.showItems();
        System.out.println("总成本: " + meal1.getCost());

    }
}
