package SingleMode;

/**
 * @date 2021年05月26日14:38
 */
public class SinginTest {
    //懒汉模式线程不安全
    /*public static Test16 test16;
    private SinginTest(){}
    public static SinginTest getInstance(){
        if(test16==null){
            test16 = new SinginTest();
        }
        return test16;
    }*/
    //懒汉模式线程安全
   /* public static SinginTest test16;
    //防止被实例化
    private SinginTest(){}
    public static synchronized SinginTest getInstance(){
        if(test16==null){
            test16= new SinginTest();
        }
        return test16;
    }*/
    //饿汉模式
    /*public static SinginTest test16 = new Test16();
    private SinginTest(){}
    public static SinginTest getInstance(){
        return test16;
    }*/
    //双层加锁
   /* public static SinginTest test16;

    private SinginTest() {
    }

    public static SinginTest getInstance() {
        if (test16 == null) {
            synchronized (SinginTest.class) {
                if (test16 == null) {
                    test16 = new SinginTest();
                }
            }
        }
        return test16;
    }*/
    //登记式、静态内部类
    public static class Test16Holder {
        public static SinginTest test16 = new SinginTest();
    }

    private SinginTest() {
    }

    public static SinginTest getInstance() {
        return Test16Holder.test16;
    }
}
