package AISECT.Array;

public class SUM_OF_ELEMENT {
    public static void main(String[] args) {
        int num[] = {1,23,45,6555,0,76} ;
        int SUM=0;
        for (int i = 0; i < num.length ; i++) {
            SUM = SUM + num[i];
        }
        System.out.println("Sum of All the Elements are :- "+ SUM);

    }
}
