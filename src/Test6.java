import java.util.HashMap;
import java.util.Map;

public class Test6 {

    public static void main(String[] args) {
        String param = "445884865355710465 445884865355710465 435510758308970496 445614183443070977 445615581404594177";
        String p = "445884865355700465";
        Map m = new HashMap();
        if(param.indexOf(p) != -1){
            m.put("settleType", "1");
        }else {
            m.put("settleType", "0");
        }
        System.out.println(m);
    }
}
