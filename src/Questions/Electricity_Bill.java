package Questions;

import java.util.Scanner;

public class Electricity_Bill {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("WELCOME TO THE HARYANA ELECTRICITY DEPARTMENT");
        System.out.println("Enter number of Units consumed :- ");
        int bill = 0 ;
        Scanner sc =  new Scanner(System.in);
        int Units = sc.nextInt();
        if(Units>1&&Units<=100){
            bill = Units * 4 ;
        } else if (Units>100&&Units<=200) {
             bill = Units * 7 ;
        } else if (Units<1) {
            System.out.println("Enter the Valid Number!- ");
        }else {
            bill = Units * 10 ;
        }
        System.out.println("Your Bill is :-  "+ bill + "₹");
    }
}
