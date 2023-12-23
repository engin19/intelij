package homework;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(123456789,25000,"Jack Sparrow");
        ba.info();
        ba.withdraw(2500);
        ba.deposit(4500);
        System.out.println("_______________________________________________");
        SavingsAccount sa=new SavingsAccount(123456789,450000,"Jack Sparrow",0.075);
        sa.info();
        sa.deposit(15000);
        sa.deposit(200);
        System.out.println("__________________________________________________");
        CheckingAccount ca=new CheckingAccount(123456789,650000,"Jack Sparrow");
        ca.info();
        ca.deposit(25600);
        ca.withdraw(250.50);
        System.out.println("______________________________________________________");
        FixedDepositAccount fda=new FixedDepositAccount(123456789,750000,"Jack Sparrow");
        fda.info();
        fda.deposit(25000);
        fda.withdraw(2549.00);




    }
}
