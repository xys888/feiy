public class Test10 {
    public static void main(String[] args) {
        String dateStart = "2021-02-05";
        String s = dateStart.replaceAll("-", "");
        //包头不包尾
        String substring = dateStart.substring(1, 3);
        System.out.println(s);
        System.out.println(substring);
    }
}
