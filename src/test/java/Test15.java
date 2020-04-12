import java.util.ArrayList;
import java.util.Random;

public class Test15 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <6 ; i++) {
            int i1 = random.nextInt(33)+1;
            list.add(i1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
}
}
