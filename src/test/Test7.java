package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Test7 {
    public static void main(String[] args) {
        double d = 121.11231;
        //第一种方式
        BigDecimal bigDecimal = new BigDecimal(d);
        double format1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        //第二种方式
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String format2 = decimalFormat.format(d);
        //第三种方式
        String format3 = String.format("%.2f", d);
        //第四种方式
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        String format4 = numberInstance.format(d);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);
    }
}
