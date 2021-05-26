package test;

import java.util.Calendar;
import java.util.Date;

/**
 * 计算每月花费交通费
 */
public class Test1 {
    static double sum = 0;

    public static void get(int j, int k) {
        int i = 1;
        for (; i <= j; i++) {
            sum = sum + k;
            if (sum > 100) {
                break;
            }
        }
        get1(i, k, sum);
    }

    public static void get1(int j, int k, double sum) {
        int i = j;
        for (; i <= 22; i++) {
            sum = sum + 0.8 * k;
            if (sum > 150) {
                break;
            }
        }
        get2(i, k, sum);
    }

    public static void get2(int j, int k, double sum) {
        int i = j;
        for (; i <= 22; i++) {
            if (sum > 150) {
                sum = sum + 0.5 * k;
            }
        }
        System.out.println(String.format("%.2f", sum));
    }

    public static Integer getHourCount() {
        Calendar c1 = Calendar.getInstance();   //当前日期
        Calendar c2 = Calendar.getInstance();   //昨天日期
        c2.setTime(new Date());
        c2.set(Calendar.HOUR_OF_DAY, 16);

        c2.add(Calendar.DATE, -1);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int oldHour = c2.get(Calendar.HOUR_OF_DAY);
        return hour + 24 - oldHour;
    }

    public static void main(String[] args) {
        get(22, 14);
        int a = 18199 + 600 + 1000 + 800 - 2600 - 1650 * 3 + 7713 + 7713 - 2600 + 7713 * 11 - 1650 * 11 - 180 * 11 - 1000 * 11 + 7712 * 12 - 1700 * 12 - 1200 * 12 - 180 * 12 + 7712 * 12 - 1700 * 12 - 1200 * 12 - 180 * 12;
        int b = 2400 * 40;
        int c = 7713 * 40;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + b);
    }
}

