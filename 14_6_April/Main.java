

public class Main {
    
    public static void main(String[] args) {
        BankAccount tempAccount = new BankAccount("Mahmut");
        //tempAccount.getBalance();
        BankAccount ben = new BankAccount("Ben");
        ben.deposit(90);
        System.out.println("Ben in hesabi "+ben.getBalance());

        BankAccount mar = new BankAccount("Martha");
        mar.deposit(40);

        ben.transfer(mar, 100);
        System.out.println("Ben in hesabi "+ben.getBalance());
        System.out.println("marthanin in hesabi "+mar.getBalance());

    }
}
