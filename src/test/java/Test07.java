public class Test07 {
    public static void main(String[] args) {
        int i =2;
        switch (i){
            case 1 :
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");

            case 3:
                System.out.println("今天星期三");

            case 4:
                System.out.println("今天星期四");
            case 5:
                System.out.println("今天星期五");
            case 6:
                System.out.println("今天星期六");
            case 7:
                System.out.println("今天星期日");
            default:
                System.out.println("你输入的数字有误");
                break;
        }
    }
}
