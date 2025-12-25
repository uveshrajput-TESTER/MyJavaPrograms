package AISECT.Array;

public class missing_number_in_continuous_array {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17};
        int index =0;

        for (int i = index; i < num.length; i++) {
            if (i+1 == num[i]) {
                continue;
            }else {
                System.out.println(i+1+ "  is Missing  ");
                index = i ;
               break;
            }
        }
}}