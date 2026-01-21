package Questions;
//Reverse A String In Java
public class ReverseString {
    static void main(String[] args) {
        String target = "asdfghjkl";
        String reverse  = "";
        char[] array = target.toCharArray();
        for (int i = (array.length-1); i >=0 ; i--){
            reverse = reverse +  array[i]  ;
        }
        System.out.println(reverse);
    }
}
