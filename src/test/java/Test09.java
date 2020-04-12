public class Test09 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        sun();
    }
    private static  int sum(int a, int b){
        int re = a+b;
        return re;

    }
    private static  void sun(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"+i);
        }
    }

}
