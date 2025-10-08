package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;

public class Java_ArrayList_example_to_remove_elements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Uvesh");
        list.add("sabir");
        list.add("imraan");
        list.add("ayaan");
        list.add("Vijay");
        System.out.println("An initial list of elements: "+list);
        list.remove("Vijay");  //Removing specific element from arraylist
        System.out.println("After invoking remove(object) method: "+list);
        //Removing element on the basis of specific position
        list.remove(0);
        System.out.println("After invoking remove(index) method: "+list);
        //Creating another arraylist
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("chattan");
        list1.add("jishan");
        list1.add("tausiif");
        list1.add("saif");
        //Adding new elements to arraylist
        list.addAll(list1);
        System.out.println("Updated list : "+list);
        //Removing all the new elements from arraylist
        list.removeAll(list1);
        System.out.println("After invoking removeAll() method: "+list);
//Removing all the elements available in the list
        list.clear();
        System.out.println("After invoking clear() method: "+list);

    }
}
