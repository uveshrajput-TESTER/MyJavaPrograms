package Questions;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class PalindromeStrings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check whether it is Palindrome or not   :- ");
        String original = sc.next();
        String reverse ="";
        for (int i = 0; i <original.length() ; i++) {
            char Temp ;
             Temp  = original.charAt(i);
             reverse = Temp + reverse;
        }
        if(original.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not A Palindrome");
        }

    }
}
