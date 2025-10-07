package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;

public class get_method_in_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Uvesh");
        list.add("Sabir");
        list.add("Uvesh1");
        list.add("Sabir1");
        list.add("Uvesh2");
        list.add("Sabir2");
        list.add("Uvesh3");
        list.add("Sabir3");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(3));

    }
}
