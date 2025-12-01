package AISECT.Array;

public class SEARCH_ELEMENT {
    public static void main(String[] args) {
        int num[] = {1, 2, 4, 5, 6, 6, 7, 8, 8, 8, 7, 7, 7, 6, 67, 67, 67, 7656, 54, 43, 43, 43, 434, 33, 43, 4, 43, 4343, 4,};
        int found = 43;
        for (int i = 0; i <num.length ; i++) {
            if (found == num[i]){
                System.out.println("Yes "+found+" is Present in this Array ");
                break;
            }
        }
    }
}
