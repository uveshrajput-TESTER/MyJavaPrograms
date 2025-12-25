package AISECT.Array;

public class SECOND_SMALLEST {
    public static void main(String[] args) {

        int num[] = new int[10];
        num = new int[]{21, 54, 67, 87, 34, 5, 6, 67, 65, 3};
        int min = num[0];
        int Second_min = 0;
        for (int i = 0; i <num.length ; i++) {
            if (min >num[i]){
                Second_min = min;
                min = num[i];

            }
        }
        System.out.println(Second_min + "   is  the Second largest Number ");
    }
}
