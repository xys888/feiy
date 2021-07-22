package lambda;

/**
 * @date 2021年07月22日15:32
 */
public class Test21 {
    public static void main(String[] args) {

    Test19.ReturnOneParam lambda1 = a -> doubleNum(a);
        System.out.println(lambda1.method(3));

    //lambda2 引用了已经实现的 doubleNum 方法
    Test19.ReturnOneParam lambda2 = Test21::doubleNum;
        System.out.println(lambda2.method(3));

        Test21 exe = new Test21();

    //lambda4 引用了已经实现的 addTwo 方法
    Test19.ReturnOneParam lambda4 = exe::addTwo;
        System.out.println(lambda4.method(2));
}

    /**
     * 要求
     * 1.参数数量和类型要与接口中定义的一致
     * 2.返回值类型要与接口中定义的一致
     */
    public static int doubleNum(int a) {
        return a * 2;
    }

    public int addTwo(int a) {
        return a + 2;
    }
}