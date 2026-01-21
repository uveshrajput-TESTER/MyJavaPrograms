package Questions;

import java.util.Scanner;

public class Avg_of_N_numbers {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("Enter the Number till you wnat the Average :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        double Avg = 0 ;
        for (int i = 0; i <n ; i++) {
            sum = sum + i ;
        }
        System.out.println("Sum :--->  "+ sum);
        Avg =  (double) sum/n ;
        System.out.println( "Average of the "+ n+" Numbers is :- "+Avg);
    }
}
