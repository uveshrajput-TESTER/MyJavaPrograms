package Questions;

import java.util.Scanner;

public class Discount {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("Enter the Percentage of the Discount :-  ");
        Scanner sc =  new Scanner(System.in);
        float Discount = sc.nextFloat();
        System.out.println("Enter the Market Price :- ");
        float MP = sc.nextFloat();
        float Discount_amount ;
        Discount_amount = (Discount*MP)/100;
        float SP = MP - Discount_amount ;
        System.out.println("Selling Price is :-  "+SP    );
    }
}
