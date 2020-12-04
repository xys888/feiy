import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static final String DATE_FULL_STR = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_LONG_STR = "yyyy-MM-dd kk:mm:ss.SSS";
    public static final String DATE_SMALL_STR = "yyyy-MM-dd";
    public static final String DATE_FORMART_STR = "yyyy/MM/dd";
    public static final String DATE_MONTH = "yyyy-MM";
    public static final String DATE_TIME = "HH:mm:ss";
    public static final String DATE_KEY_STR = "yyMMddHHmmss";
    public static final String DATE_All_KEY_STR = "yyyyMMddHHmmss";
    public static final String DATE_SIMPLE_STR = "yyyyMMdd";

    public static void main(String[] args) {
        SimpleDateFormat s1 = new SimpleDateFormat(DATE_FULL_STR);
        SimpleDateFormat s2 = new SimpleDateFormat(DATE_LONG_STR);
        SimpleDateFormat s3 = new SimpleDateFormat(DATE_SMALL_STR);
        SimpleDateFormat s4 = new SimpleDateFormat(DATE_FORMART_STR);
        SimpleDateFormat s5 = new SimpleDateFormat(DATE_MONTH);
        SimpleDateFormat s6 = new SimpleDateFormat(DATE_TIME);
        SimpleDateFormat s7 = new SimpleDateFormat(DATE_KEY_STR);
        SimpleDateFormat s8 = new SimpleDateFormat(DATE_All_KEY_STR);
        SimpleDateFormat s9 = new SimpleDateFormat(DATE_SIMPLE_STR);
        System.out.println(s1.format(new Date()));
        System.out.println(s2.format(new Date()));
        System.out.println(s3.format(new Date()));
        System.out.println(s4.format(new Date()));
        System.out.println(s5.format(new Date()));
        System.out.println(s6.format(new Date()));
        System.out.println(s7.format(new Date()));
        System.out.println(s8.format(new Date()));
        System.out.println(s9.format(new Date()));
    }
}
