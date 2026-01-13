package Questions;

import java.util.Scanner;

public class Area_Circle {
    static void main(String[] args) {
        System.out.println("Enter the Radius of the Circle :-   ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float pi = 3.14F;
        System.out.println("Area of circel is  :- " + (r*r*pi) + " cm");

    }
}
