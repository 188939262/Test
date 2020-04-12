import java.util.Random;
import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(10) + 1;//默认从0开始，随机生成1-100的数字true  10

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            if (b > i) {
                System.out.println("你输入的数字大了");
            } else if (b < i) {
                System.out.println("你输入的数字小了");
            } else {
                System.out.println("恭喜你，输入正确了");
                break;
            }
        }
    }
}
