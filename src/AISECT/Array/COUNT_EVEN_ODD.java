package AISECT.Array;

public class COUNT_EVEN_ODD {
    public static void main(String[] args) {
        int num[] = {3,4,54,67,34,79,2};
        int count_odd = 0;
        int count_even = 0 ;
        for (int i = 0; i < num.length ; i++) {
            if (num[i]%2 == 0 ){
                count_even++;
            } else count_odd++;
        }
        System.out.println("Odd-->    "+count_odd);
        System.out.println("Even-->  " + count_even);
    }
}
