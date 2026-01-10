package Questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class rupessToUSdollars {
    static void main(String[] args) {
        System.out.println("Enter the Amount in Rupees :- ");
        Scanner sc=  new Scanner(System.in);
        float  rup = sc.nextFloat();
        float dollar = 90.0f;
        System.out.println(rup/dollar);
    }
}
