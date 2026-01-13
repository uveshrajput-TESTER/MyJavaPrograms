package Questions;

import java.util.Scanner;

public class Area_Rectangle {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("Enter the Length of the Rectangular :-  ");
        Scanner sc =  new Scanner(System.in );
        float length =  sc.nextFloat();
        System.out.println("Enter the breadth of the Rectangular :-  ");
        float Breadth =  sc.nextFloat();
        float Area = length*Breadth;
        System.out.println("Area of the Rectangle is  :- "+ Area );
    }
}
