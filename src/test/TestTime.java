package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestTime {
    private static final String FORMAT_DATE_STR = "yyyy-MM-dd HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static String minusDay(Date date, int days) {
        Calendar c = new GregorianCalendar();
        c.setTime(date);
        c.set(Calendar.DATE, c.get(Calendar.DATE) - days);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        return getParseDate(FORMAT_DATE_STR, c.getTime());
    }
    public static String getParseDate(String pattern, Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern(pattern);
        return sdf.format(date);
    }

    public static Date getWorkingDayTimeByD(String timess) {
        //定义一个日历类型的时间
        Calendar calendar = Calendar.getInstance();
        //定义一个Date对象
        Date parse = null;
        try {
            //将String类型的时间类型转换成Date类型
            parse = simpleDateFormat.parse(timess);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(parse);
        calendar.set(Calendar.HOUR_OF_DAY, 4);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.DATE, -1);
        return calendar.getTime();
    }


    public static void main(String[] args) {

        Date date = null;
        try {
            date =  simpleDateFormat.parse("2021-02-05");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(minusDay(date,2));
        System.out.println(getParseDate("yyyy-MM-dd 00:00:00",date));
    }

}
