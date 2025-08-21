package Questions;

import java.util.Scanner;

public class Print1to10to1 {
    public static void main(String [] args){
//    int a = 9 ;
//    for (int i = 1;i < 20 ;  i++ ) {
//
//        if (i <= 10) {
//            System.out.println(i);
//        }
//        else{
//            System.out.println(a);
//            a--;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the +ve integer  :-  ");
        int in = sc.nextInt();
        int b = 0;
        for (int i =1;i<in*2;i++){
            if(i>in){
            b = b + 2;
            System.out.println(i-b);
    }else {
                System.out.println(i);
        }}
    }
}
