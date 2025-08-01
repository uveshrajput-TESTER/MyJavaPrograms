package Questions;

public class greaterfromtwonumber {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);
        if (a>b)
            System.out.printf(a + "Greater than " + b );
        else
            System.out.printf(b + "Greater than " + a );
    }
}
