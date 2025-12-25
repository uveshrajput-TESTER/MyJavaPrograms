package AISECT.Array;

public class SECOND_LARGEST {

    public static void main(String[] args) {

        int num[] = new int[10];
        num = new int[]{21, 54, 67, 87, 34, 5, 6, 67, 65, 3};
        int max = num[0];
        int Second_max = 0;
        for (int i = 0; i <num.length ; i++) {
            if (max<num[i]){
                Second_max = max ;
                max = num[i];

            }
        }
        System.out.println(Second_max + "   this is the Second largest Number ");
    }
}
