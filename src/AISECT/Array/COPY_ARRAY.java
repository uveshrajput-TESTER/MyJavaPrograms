package AISECT.Array;

public class COPY_ARRAY {
    public static void main(String[] args) {
        int num[] = {12,23,35,456,5768,87};
        int[] copy = new int[num.length];
        for (int i = 0; i <num.length ; i++) {
             copy[i]=num[i];
            System.out.println(copy[i]);
        }
    }
}
