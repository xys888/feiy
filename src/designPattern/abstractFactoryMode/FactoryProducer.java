package designPattern.abstractFactoryMode;

import designPattern.abstractFactoryMode.factory.AbstractFactory;
import designPattern.abstractFactoryMode.factory.ColorFactory;
import designPattern.abstractFactoryMode.factory.ShapeFactory;

/**
 * 第三步
 * 生产工厂的类
 *
 * @author xys
 * @date 2021年05月26日14:32
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
