package test;

public class Test3 {
    static double a = -9.8;//-10
    static double b = 7.4;//7
    static double c = -3.4;//-3
    static double d = -12.8;//-12

    public static void main(String[] args) {
        System.out.println("第一次");
        System.out.println(Math.ceil(a));
        System.out.println(Math.ceil(b));
        System.out.println(Math.ceil(c));
        System.out.println(Math.ceil(d));

        System.out.println("第二次");
        System.out.println(Math.floor(a));
        System.out.println(Math.floor(b));
        System.out.println(Math.floor(c));
        System.out.println(Math.floor(d));

        System.out.println("第三次");
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));
        System.out.println(Math.round(c));
        System.out.println(Math.round(d));
    }

}
