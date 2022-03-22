package designPatternTest.prototypeMode;

/**
 * @date 2022年03月15日17:10
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.localCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.println("Shape : " + shape.getType());

        Shape shape1 = ShapeCache.getShape("2");
        System.out.println("Shape : " + shape1.getType());

        Shape shape2 = ShapeCache.getShape("3");
        System.out.println("Shape : " + shape2.getType());


    }

}
