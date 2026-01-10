package Questions;

import java.util.Scanner;

public class lowercaseOrUppercase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any single letter or Character :-   ");
        String ch1 = sc.next();
        char[]  ch = ch1.toCharArray();
        if ((ch[0]>='a') & (ch[0]<='z')){
            System.out.println("Lowercase   --->    " + ch[0]);
    }else {
            System.out.println("UppercASE ---->   " +  ch[0]);
        }

    }}
