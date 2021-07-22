package lambda;


import java.util.ArrayList;
import java.util.Collections;

/**
 * @date 2021年07月22日15:38
 */
public class Test22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,2,3,4,5);

        //lambda表达式 方法引用
        list.forEach(System.out::println);
        System.out.println("=====");
        list.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });
    }
}
