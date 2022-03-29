package ArrayLists_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class MixExamples {

    public static void main(String[] args) {
        
        // create 3 suppliers
        Supplier s1 =  new Supplier("Company 1");
        Supplier s2 =  new Supplier("Company 2");
        Supplier s3 =  new Supplier("Company 3");
        Supplier s4 =  new Supplier("Company 4");

        Product p1 = new Product("Product 1");
        Product p2 = new Product("Product 2");
        Product p3 = new Product("Product 3");
        Product p4 = new Product("Product 4");
        Product p5 = new Product("Product 5");

        HashMap<Supplier,ArrayList<Product>> sup2pro = new HashMap<Supplier,ArrayList<Product>>();

        ArrayList<Product> s1Products = new ArrayList<Product>();
        s1Products.add(p1);
        s1Products.add(p3);
        s1Products.add(p4);

        ArrayList<Product> s2Products = new ArrayList<Product>();
        s1Products.add(p2);
        s1Products.add(p5);

        sup2pro.put(s1, s1Products);
        sup2pro.put(s2, s2Products);

    }


    
}

class Supplier{

    // Attributes
    private String id = "";
    String companyName;
    ArrayList<Product> products;

    // Constructor
    public Supplier(String name){    
        this.companyName = name;
        for(int i = 0 ; i < 11 ; i++){
            this.id += (int)( Math.random() * 10); 
        }

        System.out.println("ID: "+ this.id);
        
    }

}

class Product{

    // Attributes
    private String id;
    String productName;
    double price;

    // Constructor
    public Product(String name){    
        this.productName = name;
        for(int i = 0 ; i < 11 ; i++){
            this.id += (int)( Math.random() * 10); 
        }

        System.out.println("ID: "+ this.id);
        
    }


}
