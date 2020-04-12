public class Test10 {

    public static void main(String[] args) {
        int[] arr = {1, 23, 5, 6,534543};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为"+max);

    }
    public static void println(int a) {
        System.out.println(a);

    }

}
