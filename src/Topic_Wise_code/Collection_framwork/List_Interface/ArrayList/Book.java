package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

public class Book {
     private final int id ;
    private final String name,author,publisher;
    private final int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public void get(){
        System.out.println(this.id+" "+this.name+" "+this.author+" "+this.publisher+" "+this.quantity);
    }
}
