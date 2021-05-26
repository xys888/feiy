package test;

public class Test3 {
    static double a = 2.9;
    static double b = 2.1;
    static double c = -2.9;
    static double d = -2.1;

    public static void main(String[] args) {
        System.out.println("第一次");
        System.out.println(Math.ceil(a));
        System.out.println(Math.ceil(b));
        System.out.println(Math.ceil(c));
        System.out.println(Math.ceil(d));

        System.out.println("第二次");
        System.out.println( Math.floor(a));
        System.out.println(Math.floor(b));
        System.out.println( Math.floor(c));
        System.out.println(Math.floor(d));

        System.out.println("第三次");
        System.out.println( Math.round(a));
        System.out.println(Math.round(b));
        System.out.println( Math.round(c));
        System.out.println(Math.round(d));
    }

}
