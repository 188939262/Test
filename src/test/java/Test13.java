import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println("输入的第一个数字是"+c);
        int a  =  sc.nextInt();
        System.out.println("输入的第一个数字是"+a);
        int b =sc.nextInt();
        System.out.println("输入的第一个数字是"+b);

        int d = c < a ? a :c;
        int e = d < b ? b :d;

        System.out.println("===================================");
         if (d < e){
             System.out.println("最大值是"+e);
         }else {
             System.out.println("最大值是"+d);
         }
    }
}
