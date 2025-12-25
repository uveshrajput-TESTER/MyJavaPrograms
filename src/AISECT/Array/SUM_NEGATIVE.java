package AISECT.Array;

public class SUM_NEGATIVE {
    public static void main(String[] args) {

        int num[] = {12,34,45,4556,-67,-76,-6767,7,56,5,3,2,2,4,5};
        int sum = 0 ;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]<0){
                sum = num[i] + sum ;
            }
        }
        System.out.println(sum + "   Positive Numbers ");
    }
}
