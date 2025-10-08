package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;

public class ArrayList_Example_Book {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Book b:list){
            b.get();
        }
    }
}
