package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;

public class Java_ArrayList_example_of_isEmpty_method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Is ArrayList Empty: " + list.isEmpty());
        list.add("Uvesh");
        list.add("sabir");
        list.add("imraan");
        list.add("ayaan");
        list.add("Vijay");
        System.out.println("After Insertion");
        // Check if the ArrayList is empty after insertion
        System.out.println("Is ArrayList Empty: " + list.isEmpty());

    }
}
