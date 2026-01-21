package Questions;

public class NmbrPalindrome {
//    Find if a number is palindrome or not
static void main(String[] args) {
    int num =  12343545;
    int reverse = 0;
    boolean cond = true ;
    while (cond){
        int Temp = num%10;
        reverse =  reverse*10 + Temp ;
        num=num/10;
        if(num<=0){
            cond = false;
        }
    }
    if (num == reverse){
        System.out.println("Palindrome");
    }else {
        System.out.println("Not A  Palindrome ");
    }
}
}
