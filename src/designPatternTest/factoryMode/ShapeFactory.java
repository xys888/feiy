package designPatternTest.factoryMode;

import designPattern.factoryMode.face.Shape;
import designPattern.factoryMode.shape.Circle;
import designPatternTest.factoryMode.shape.Rectangle;
import designPatternTest.factoryMode.shape.Square;

/**
 * @date 2022年03月15日17:17
 */
public class ShapeFactory {

    public Shape getInfo(String shapeType){
        if(null == shapeType){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
