package Questions;

import java.util.Scanner;

public class sumAllofnumbers {
    static void main(String[] args) {
        boolean condition = true;
        long sum = 0 ;
        long max = 0 ;
        Scanner sc = new Scanner(System.in);
        while(condition){
            System.out.println("enter number for Sum or 0 for exit the programme  ");
            long input = sc.nextLong();
            if(input>max){
                max = input ;
            }
           sum = sum + input ;
           if (input == 0){
               condition = false;
           }


        }
        System.out.println(max + "   :- Max Value is ");
        System.out.println(sum + "   :- Total sum ");
    }
}
