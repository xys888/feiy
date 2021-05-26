package test;

public class Test9 {

    public static void test1(String s1){
        if(s1 == "flag"){
            System.out.println(1);
        }
        if(s1 !=null){
            System.out.println(2);
        }
        if("flag".equals(s1)) {
            System.out.println(3);
        }
        if(s1.length()>0){
            System.out.println(4);
        }
    }
    public static void main(String[] args) {
        String s = "flag";
        test1(s);
    }
}
