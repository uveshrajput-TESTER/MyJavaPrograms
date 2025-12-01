package AISECT.Array;

public class MAXIMUM_NO_FIND {
    public static void main(String[] args) {
        int num[] = {1,23,45,6555,76} ;
        int max = num[0];
        for (int i = 0; i < num.length ; i++) {
            if (num[i]>max) {
            max = num[i];
            }
        }
        System.out.println(max);

    }
}
