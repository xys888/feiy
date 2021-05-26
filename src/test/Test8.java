package test;

public class Test8 {
    public static void main(String[] args) {
        double[] arr1 = new double[80];
        for(int i =0;i<arr1.length;i++){
            arr1[i]=(int)(Math.random()*1000)-500;
        }
        for(int k=0;k<20;k++){
            System.out.println(arr1[k]);
        }
        int sum = 0;
        for(int j=0;j<20;j++){
            sum = (int) (sum+ arr1[j]);
       }
        System.out.println("==========================================================");
        System.out.println(sum);
        System.out.println(Math.abs(sum));
        for(int i = 0;i<64;i++){
            String url = "db"+i+".jdbc.url";
            System.out.println(url);
        }
    }
}
