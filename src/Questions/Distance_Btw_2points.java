package Questions;

import java.util.Scanner;

public class Distance_Btw_2points {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        Scanner sc =  new Scanner( System.in);
        System.out.println("Enter the Coordinates of first point:- ");
        System.out.print("Enter X1 :-   ");
        int x1 = sc.nextInt();
        System.out.print("Enter Y1 :-  ");
        int y1 = sc.nextInt();
        System.out.println("Enter the Coordinates of Second point:- ");
        System.out.print("Enter X2 :-   ");
        int x2 = sc.nextInt();
        System.out.print("Enter Y2 :-  ");
        int y2 = sc.nextInt();
        int temp1 = x2 - x1 ;
        int temp2 = y2 - y1;
        double Distance = Math.sqrt((temp2*temp2)  + (temp1*temp1) );
        System.out.println("Distance is :- "+ Distance);



    }
}
