package Questions;

public class Marks_switch {
//    Write a program to check the grade of a student based on marks using if-else-if
public static void main(String[] args) {
    int marks = 69;
    int grade  =  marks/10;

    switch (grade){
        case 0,1,2:
            System.out.println("Grade D Or Fail");
            break;
        case 3,4,5:
            System.out.println("Grade C ");
            break;
        case 6,7:
            System.out.println("Grade B");
            break;
        case 8,9,10:
            System.out.println("Grade A ");
            break;
        default:
            System.out.println("Enter Valid Marks ");
    }
}

}
