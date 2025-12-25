package Questions;

import java.sql.SQLOutput;
import java.util.Scanner;
//write a programe uuuuuuusing ternary operator
public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Enter any Integer ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Enter Any Integer");
        int b = sc.nextInt()  ;

        int max = (a>b)? a :b ;
        System.out.println(max + " Is the Maximum Value ");
    }
}
