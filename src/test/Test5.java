package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test5 {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    ////获取当前时间的前一天时间
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

    //获取当前时间距离某一个时间点的小时数
    public static Integer getHourCount() {
        Calendar c1 = Calendar.getInstance();   //当前日期
        Calendar c2 = Calendar.getInstance();   //昨天日期
        c2.setTime(new Date());
        c2.set(Calendar.HOUR_OF_DAY, 16);
        c2.set(Calendar.MINUTE, 0);
        c2.set(Calendar.SECOND, 0);
        c2.add(Calendar.DATE, -1);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int oldHour = c2.get(Calendar.HOUR_OF_DAY);
        return hour+24-oldHour;
    }
    public static void main(String[] args) {
        System.out.println(getWorkingDayTimeByD("2020-12-07"));
    }
}
