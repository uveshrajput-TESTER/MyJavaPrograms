package Questions;

import java.util.Scanner;

public class Area_Isolesceles_Triangle {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
//        Isosceles triangle me do sides equal hoti hain aur base alag hota hai
        System.out.println("Enter the same side ;- ");
        Scanner sc = new Scanner(System.in);
        float   same = sc.nextFloat();
        System.out.println("Enter the Base :- ");
        float base =  sc.nextFloat();
        float temp = (same*same)-((base/2)*(base/2));
        float Hieght =  (float) Math.sqrt(temp);
        float Area = (1.0f/2)*base*Hieght;
        System.out.println("Area of the Triangle is :- "+ Area);
    }
}

