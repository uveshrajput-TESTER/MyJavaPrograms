package Questions;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Week_Using_Switch {
//    Write a program to find the day of the week using a switch statement (1=Monday, 2=Tuesday, etc.).
public static void main(String[] args) {
    System.out.println("Enter The Number from 1 to 7");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    switch (a) {
        case 1 :
            System.out.println("Monday");
            break;
        case 2 :
            System.out.println("Tuesday");
            break;
        case 3 :
            System.out.println("Wednesday");
            break;
        case 4 :
            System.out.println("Thursday");
            break;
        case 5 :
            System.out.println("Friday");
            break;
        case 6 :
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println( " Sunday");
            break  ;
        default:
            System.out.println("Enter proper Number ");

    }

}


}
