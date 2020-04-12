public class Test19 {
    public static void main(String[] args) {

        int[] number = {3,1,2,34,4};
        int a ,j;
        for (a= 0;a<number.length -1;a++){
            for (j =0;j<number.length -1-a;j++){
                if(number[j]>number[j+1]){
                    int temp = number[j];
                    number[j] =number[j+1];
                    number[j+1] =temp;
                }
            }
        }
        System.out.println("从小到大的数字为");
        for (int i = 0; i <number.length ; i++) {
            System.out.println(number[i]+" ");

        }
    }
}
