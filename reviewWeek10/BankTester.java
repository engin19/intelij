package reviewWeek10;

public class BankTester {
    public BankTester() {
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount(1200,"abchj","fashls");
        b.setBalance(4500);
        System.out.println(b.getBalance());
    }
}
