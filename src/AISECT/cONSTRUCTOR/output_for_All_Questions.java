package AISECT.cONSTRUCTOR;

public class output_for_All_Questions {
    public static void main(String[] args) {
        System.out.println("Student Class");
        Students S1 = new Students();
        S1.name ="Uvesh";
        S1.Age = 20 ;
        System.out.println(S1.name +"  " +S1.Age);
        System.out.println(" ");
        System.out.println("Car Class");
        CAR Alto = new CAR();
        Alto.Company ="Maruti";
        Alto.Price  = "6 lakh ";
        Alto.Speed = "90 km/hr";
        Alto.PRINT();
        System.out.println(" ");
        System.out.println("Book");
        Book B1 = new Book();
        B1.Author = "BCA PYQs";
        B1.title = "SUMAN WADHWA ";
        B1.display();
        System.out.println("  ");
        DEFAULT_CONSTRUCTOR d = new DEFAULT_CONSTRUCTOR();
        System.out.println("Parameterized constructor");

        System.out.println("  ");
        PARAMETRIZED_CONSTRUCTOR p = new PARAMETRIZED_CONSTRUCTOR("Uvesh","Male",20);
        System.out.println("Rectangle ");
        Rectangle R1 = new Rectangle();
        R1.length = 20;
        R1.Breadth =2;
        R1.Area();


     }
}
