package Questions;

import java.util.Scanner;

public class Leap_Year_Loop {
    public static void main(String[] args) {
        System.out.println("Enter Starting Year ");
        Scanner sc = new Scanner(System.in);
        int Year1 = sc.nextInt();
        System.out.println("Enter Ending Year ");
        int Year2 = sc.nextInt();
        int max =(Year1>Year2)?Year1:Year2;
        int min =(Year1<Year2)?Year1:Year2;

            for (int i = min; i <=max ; i++) {
                int year = i;
                if (year%100 == 0){

                }else {
                    if((year%4 == 0)||(year%400 == 0)){
                        System.out.println(year + "  is A Leap Year ");
                    }
                }

            }
        }
}
