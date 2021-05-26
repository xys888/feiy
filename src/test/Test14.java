package test;

public class Test14 {


    public static void main(String[] args) {
        int a = testReturn1();
        System.out.println("aaa" + a);
    }

    private static int testReturn1() {
        int i = 1;
        try {
            i++;
            System.out.println("try" + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch" + i);
        } finally {
            i++;
            System.out.println("finally" + 4);
            System.out.println();
        }
        return i;
    }
}
