package Questions;

import java.util.Scanner;

public class sumAllofnumbers {
    static void main(String[] args) {
        boolean condition = true;
        long sum = 0 ;
        Scanner sc = new Scanner(System.in);
        while(condition){
            System.out.println("enter number for Sum or 0 for exit the programme  ");
            long input = sc.nextLong();
           sum = sum + input ;
           if (input == 0){
               condition = false;
           }
        }
    }
}
