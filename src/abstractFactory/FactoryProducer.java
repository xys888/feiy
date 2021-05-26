package abstractFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.ColorFactory;
import abstractFactory.factory.ShapeFactory;

/**
 * 生产工厂的类
 * @date 2021年05月26日14:32
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
