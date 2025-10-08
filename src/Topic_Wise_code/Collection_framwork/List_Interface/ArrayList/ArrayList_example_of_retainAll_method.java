package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_example_of_retainAll_method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Uvesh");
        list.add("sabir");
        list.add("imraan");
        list.add("ayaan");
        list.add("Vijay");
        System.out.println("An initial list of elements: "+list);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Uvesh");
        list1.add("sabir");
        System.out.println("An initial list1 of elements: "+list1);
        list.retainAll(list1);

        System.out.println("Iterating the elements after retaining the elements of list1:");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
