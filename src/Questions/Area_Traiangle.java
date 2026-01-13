package Questions;

import java.util.Scanner;

public class Area_Traiangle {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("This programme finds the Area of the Triangle :- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type R or r for Right Angle triangle :-  ");
        System.out.println("Type H or h for using Heron's formula  :- ");
        System.out.println("Type B or b for Area=1/2×Base×Height ");
        String expression   = sc.next().trim().toLowerCase();
        switch (expression){
            case "r":
                    System.out.println("Enter Perpendicular  :-   ");
                    float perpendicular = sc.nextFloat();
                    System.out.println("Enter base :-   ");
                    float  base = sc.nextFloat();
                    float Area = (1.0f/2 )*perpendicular*base;
                    System.out.println("Area of the Trianlge is :-   "+Area);
                break;
            case "h" :
                System.out.println("Enter side a  of Triangle  :-   ");
                float a = sc.nextFloat();
                System.out.println("Enter side b of Triangle :-   ");
                float  b = sc.nextFloat();
                System.out.println("Enter side c of Triangle :-   ");
                float  c = sc.nextFloat();
                float s = (a+b+c)/2.0f;
                float temp =  s*(s-a)*(s-b)*(s-c);
                float area = (float)Math.sqrt(temp);
                System.out.println("Area of the Trianlge is :-   "+area);
                break;
            case "b" :
                System.out.println("Enter Base of Triangle  :-   ");
                float Base = sc.nextFloat();
                System.out.println("Enter Hieght of Triangle :-   ");
                float  Hieght = sc.nextFloat();
                float result =  1.0f/2 *Hieght*Base;
                System.out.println("Area of the Trianlge is :-   "+result);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + expression);
        }
    }
}
