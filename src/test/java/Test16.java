import java.util.Arrays;

public class Test16 {

    public static void main(String[] args) {

        String arr = "adcbgjhgjhgjhgjh";//将字符串转为数组形式

        char[] chars = arr.toCharArray();

        Arrays.sort(chars);

        for (int i =chars.length-1;i>=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
