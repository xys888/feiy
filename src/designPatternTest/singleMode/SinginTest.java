package designPatternTest.singleMode;

/**
 * @date 2022年03月15日15:09
 */
public class SinginTest {
    /**
     * 懒汉模式
     */
  /*  private static SinginTest singinTest;

    public SinginTest() {
    }
    public static SinginTest getSinginTest(){
        if(singinTest == null){
            return new SinginTest();
        }
        return singinTest;
    }*/

    /**
     * 懒汉模式线程安全
     */
   /* private static SinginTest singinTest;

    private SinginTest(){

    }
    public static synchronized  SinginTest getSinginTest(){
        if(singinTest == null){
            return new SinginTest();
        }
        return singinTest;
    }*/

    /**
     * 饿汉模式
     */
/*
    private static SinginTest singinTest = new SinginTest();

    private SinginTest(){

    }

    public static SinginTest getSinginTest(){
        return singinTest;
    }*/

    /**
     * 双重检索模式
     */
   /* public static volatile SinginTest singinTest = null;
    private SinginTest(){
    }
    public static SinginTest getSinginTest(){
        if(null == singinTest){
            synchronized (SinginTest.class){
                if(null == singinTest){
                    singinTest = new SinginTest();
                }
            }
        }
        return singinTest;
    }*/

    /**
     * 登记式 静态内部类
     */
    public static class Test {
        public static SinginTest test16 = new SinginTest();
    }

    private SinginTest() {
    }

    public static SinginTest getInstance() {
        return Test.test16;
    }
}
