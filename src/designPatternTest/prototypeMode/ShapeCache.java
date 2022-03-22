package designPatternTest.prototypeMode;

import designPatternTest.prototypeMode.impl.Circle;
import designPatternTest.prototypeMode.impl.Rectangle;
import designPatternTest.prototypeMode.impl.Square;

import java.util.Hashtable;

/**
 * @date 2022年03月15日17:02
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap =  new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();

    }

    public static void localCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);

    }
}
