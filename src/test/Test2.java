package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Calendar calDate = Calendar.getInstance();
            Date time = calDate.getTime();
            SimpleDateFormat fmt = new SimpleDateFormat();
            fmt.applyPattern("yyyy-MM-dd HH:mm:ss");
            String strDate = fmt.format(time);
            System.out.println(strDate);
        }
    }


    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.run();
    }
}
