import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2021年04月15日09:53
 */
public class Test13 {
    public static void main(String[] args) {
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd 00:20:00").format(new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"));
            System.out.println(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
      int day =0;

        if(day > 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
