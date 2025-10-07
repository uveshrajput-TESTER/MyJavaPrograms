package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterate_the_ArrayList_By_ListIterator_Interface {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Uvesh");
        list.add("Sabir");
        list.add("Chattaan");
        list.add("Aasif");
        ListIterator<String> litr = list.listIterator();
        System.out.println("Through ListIterator we can traverse forward or backward both on Arraylist");
        System.out.println("element iterates in Forward order");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("element iterates in reverse order");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
