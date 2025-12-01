package AISECT.Array;

public class MINIMUM_NO_FIND {
    public static void main(String[] args) {
        int num[] = {1,23,45,6555,0,76} ;
        int min = num[0];
        for (int i = 0; i < num.length ; i++) {
            if (num[i]<min) {
                min = num[i];
            }
        }
        System.out.println(min);

    }
}
