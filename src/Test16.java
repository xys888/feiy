/**
 * 单例模式
 *
 * @date 2021年05月26日13:52
 */
public class Test16 {
    //懒汉模式线程不安全
    /*public static Test16 test16;
    private Test16(){}
    public static Test16 getInstance(){
        if(test16==null){
            test16 = new Test16();
        }
        return test16;
    }*/
    //懒汉模式线程安全
   /* public static Test16 test16;
    //防止被实例化
    private Test16(){}
    public static synchronized Test16 getInstance(){
        if(test16==null){
            test16= new Test16();
        }
        return test16;
    }*/
    //饿汉模式
    /*public static Test16 test16 = new Test16();
    private Test16(){}
    public static Test16 getInstance(){
        return test16;
    }*/
    //双层加锁
   /* public static Test16 test16;

    private Test16() {
    }

    public static Test16 getInstance() {
        if (test16 == null) {
            synchronized (Test16.class) {
                if (test16 == null) {
                    test16 = new Test16();
                }
            }
        }
        return test16;
    }*/
    //登记式、静态内部类
    public static class Test16Holder {
        public static Test16 test16 = new Test16();
    }

    private Test16() {
    }

    public static Test16 getInstance() {
        return Test16Holder.test16;
    }
}
