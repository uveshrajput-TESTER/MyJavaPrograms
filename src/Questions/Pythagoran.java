package Questions;

public class Pythagoran {
//    Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
static void main(String[] args) {
    int n1 = 21;
    int n2 = 23;
    int n3 = 34;
    if((n1*n1) + (n2*n2) == (n3*n3) ){
        System.out.println("Pythagorean triplet ");
    }else {
        System.out.println("Not Pythagorean triplet ");
    }

}

}
