package Questions;

public class EvenorOdd {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if ((a&1) == 0)
            System.out.println("The number is even  :-  " + a);
        else
            System.out.println("The Given Number is odd  :-   " + a);
    }
}
