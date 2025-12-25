package AISECT.Array;

public class CHECK_SORTED_OR_NOT {
    public static void main(String[] args) {
        int num[] = {34673,78,65,64,9,6,3,1};
        int num1[] = {21,43,56,78,90};
        int count = 0 ;
        int count1 = 0 ;
        System.out.println("I am checking the Ascending Sorting ");
        for (int i = 1; i <num1.length ; i++) {
            if(num1[i-1]<num1[i]){
                count++;
            } else{
                System.out.println("Not Sorted ");
                break;
            }
            if (count == (num1.length - 1)) {
                System.out.println("Sorted");
            }
        }
        System.out.println("I am checking the Descending Sorting ");
        for (int i = 1; i <num.length ; i++) {
            if(num[i-1]>num[i]){
                count1++;
            } else{
                System.out.println("Not Sorted ");
                break;
            }
            if (count1 == (num.length - 1)) {
                System.out.println("Sorted");
            }
        }
    }
}
