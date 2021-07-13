package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @date 2021年07月12日12:25
 */
public class Test17 {
    public static Date string2Date(String strDate, String format) throws Exception {
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        Date date = fmt.parse(strDate);
        return date;
    }
    public static void main(String[] args){
        System.out.println();
    }
}
