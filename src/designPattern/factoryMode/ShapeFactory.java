package designPattern.factoryMode;

import designPattern.factoryMode.face.Shape;
import designPattern.factoryMode.shape.Circle;
import designPattern.factoryMode.shape.Rectangle;
import designPattern.factoryMode.shape.Square;

/**
 * 第三步
 * @author xys
 * @date 2021年05月26日15:16
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
