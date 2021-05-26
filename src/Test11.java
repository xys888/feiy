import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

/**
 * StringJoiner 的简单示例
 */
public class Test11 {
    public static int diffDay(Date dateBegin, Date dateEnd){
        long milliSencods = dateEnd.getTime()-dateBegin.getTime();
        long intDiff = milliSencods /(1000*60 * 60 * 24);
        return (int) intDiff;
    }
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("===","【","】");
        StringJoiner add = stringJoiner.add("ew").add("pq").add("zl");
        System.out.println(add.toString());
        System.out.println(add.toString());
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        SimpleDateFormat formatter1 = new SimpleDateFormat( "yyyyMMdd ");
        String s = "2021-04-09 ";
        try {
            Date date = new SimpleDateFormat( "yyyy-MM-dd ").parse(s);
            System.out.println(date);
            String format = new SimpleDateFormat( "yyyyMMdd ").format(new SimpleDateFormat( "yyyy-MM-dd ").parse(s));
            System.out.println(format);
            int i = diffDay(date, new Date());
            System.out.println(i);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            String date = new SimpleDateFormat("yyyyMMdd").format(new SimpleDateFormat("yyyy-MM-dd").parse("2021-09-04"));
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
