package Questions;

import java.util.Scanner;

public class Area_parallelogram {
    static void main(String[] args) {
        System.out.println("Enter the hight of the Parallelogram:- ");
        Scanner sc = new Scanner(System.in);
        float Hight = sc.nextFloat();
        System.out.println("Enter the Base of the Parallelogram:- ");
        float base = sc.nextFloat();
        float Area = Hight*base;
        System.out.println("The Area of the Parallelogram is :-  "+ Area);
    }
}
