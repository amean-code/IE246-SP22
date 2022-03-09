public class Main {
    
    public static void main(String[] args) {
       
        Customer muhammad = new Customer(23334235, "Muhammad", "Halil" , 1000, 0);
        Customer kagan = new Customer(12312, "Kagan", "Kartci", 70, 0);

         //kagan.show_customer();
        // muhammad.show_customer();
        // muhammad.upload_money(20);
        // muhammad.show_customer();
        // muhammad.withdraw_money(150);
        // muhammad.show_customer();
        // muhammad.withdraw_money(1050);

        // muhammad.balance = 9000000;
        System.out.println(muhammad.Name + " has " + muhammad.getBalance() + " balance.");

        kagan.setBirthYear(1000);
    }

}
