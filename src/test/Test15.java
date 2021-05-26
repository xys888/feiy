package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @date 2021年05月11日15:47
 */
public class Test15 {
    //阶乘
    public static void jieCheng(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }

    public static String getRandom1() {
        int rs = (int) ((Math.random() * 9 + 1) * Math.pow(10, 10 - 1));
        return String.valueOf(rs);
    }

    private static void getTest() {
        StringBuilder str = new StringBuilder();//定义变长字符串
        Random random = new Random();
       //随机生成数字，并添加到字符串
        for (int i = 0; i < 8; i++) {
            str.append(random.nextInt(10));
        }
        //将字符串转换为数字并输出
        int num = Integer.parseInt(str.toString());
        System.out.println(num);
    }


    public static  Long nextId1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmm");
        String format = simpleDateFormat.format(new Date());
        String test = getTest1();
        String id =format+test;
        return Long.valueOf(id);
    }
    private static String getTest1() {
        StringBuilder str = new StringBuilder();//定义变长字符串
        Random random = new Random();
        //随机生成数字，并添加到字符串
        for (int i = 0; i < 7; i++) {
            str.append(random.nextInt(10));
        }
        //将字符串转换为数字并输出
//        int num = Integer.parseInt(str.toString());
        return str.toString();
    }
    public static void main(String[] args) {
//        jieCheng(18);
//        getRandom1();
//        getTest();
    }
}
