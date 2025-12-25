package AISECT.Array;

public class COUNT_NO_ELEMENT {
    public static void main(String[] args) {
        int num[] = {21,32,43,4,6,7,6,34,78,7,7,7,7,7,7,7,7,7,77,7};
        int found = 7;
        int count = 0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i] == found){
                count++;
            }
        }
        System.out.println(count);
    }
}
