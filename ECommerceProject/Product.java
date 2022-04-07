public abstract class Product {

    // MAIN
    public static void main(String[] args) {

        Hamburger p = new Hamburger();


    }

    // Attributes
    int product_id;
    String title;
    double price,cost;
   
}

abstract class Food extends Product{

    // Attribute
    boolean isHot;
    String dueDate;

}

class Hamburger extends Food{



}

class Electronics extends Product{



}
