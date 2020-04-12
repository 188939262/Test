import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test17 {
        public static void main(String[] args) throws ParseException {
            //1.使用Scanner中的方法next,获取出生日期(字符串)
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的出生日期,格式:yyyy-MM-dd");
            String birthdayString = sc.next();
            //2.使用DateFormat中的方法parse方法把字符串格式的出生日期,转换为Date格式的出生日期
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//多态
            Date birthdayDate = sdf.parse(birthdayString);
            //3.把Date格式的出生日期转换为毫秒值
            long birthdaySecond = birthdayDate.getTime();
            //4.获取当前的日期,转换为毫秒
            long todaySecond = new Date().getTime();
            //5.使用当前日期的毫秒值-出生日期的毫秒值
            long second = todaySecond - birthdaySecond;
            //6.把毫秒的差值转换为天(s/1000/60/60/24)
            if(second<0){
                System.out.println("您还未出生!");
            }else{
                //System.out.println("您已经活了"+(second/1000/60/60/24)+"天");
                System.out.println("您已经活了"+(second/1000/60/60/24/365)+"年");
            }
        }
    }

