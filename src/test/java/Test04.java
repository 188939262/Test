import java.util.stream.IntStream;

public class Test04 {
    public static void main(String[] args) {
        int i = (1>2?1:200);
        System.out.println(i);
        methch();
        diaoyong();
        operator();
    }

    private static  void methch(){
        System.out.println("这是我自己定义的方法，需要被调用才能执行");
    }

    private static  void diaoyong(){
        long count = IntStream.rangeClosed(1,100).sum();
        System.out.println(count);
    }
    private static void operator(){
         int i=0;
         i=(1==2?100:200);
       System.out.println(i);
       int j=0;
       j=(3<=4?500:600);
        System.out.println(j);
    }

}
