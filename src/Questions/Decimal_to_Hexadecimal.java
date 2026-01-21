package Questions;

import java.util.Scanner;

public class Decimal_to_Hexadecimal {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("Enter the Decimal value :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String Hexadeciml ="" ;
        int temp ;
        boolean condition = true ;
        while(condition){
            temp = num%16;
            if(temp == 10){
                Hexadeciml = "A" + Hexadeciml;
            }
            if(temp == 11){
                Hexadeciml = "B" + Hexadeciml;
            }
            if(temp == 12){
                Hexadeciml = "C" + Hexadeciml;
            }
            if(temp == 13){
                Hexadeciml = "D" + Hexadeciml;
            }
            if(temp == 14){
                Hexadeciml = "E" + Hexadeciml;
            }
            if(temp == 15){
                Hexadeciml = "F" + Hexadeciml;
            }
            Hexadeciml =  temp + Hexadeciml;
            num = num/16;
            if(num<=0){
                condition = false;
            }
        }
        System.out.println( "Hexadecimal number is :-   " + Hexadeciml);

    }
    }

