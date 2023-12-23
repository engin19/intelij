package homework;
/*2)Banking System Task: Design a BankAccount class with subclasses
SavingsAccount, CheckingAccount, and FixedDepositAccount.

Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform operations like depositing and withdrawing funds.
*/
public class BankAccount {
    private final int accountNumber;
    double balance;
    private final String accountHolderName;

BankAccount(int accountNumber,double balance, String accountHolderName){
    this.accountNumber=accountNumber;
    this.balance=balance;
    this.accountHolderName=accountHolderName;
}
public void info(){
    System.out.println("Account holders name: "+accountHolderName+" Account number :"+accountNumber+" total balance :"+balance);
}
public void deposit(double money){
    double total=balance+money;
    System.out.println("Deposit amount: "+money+"total balanca: "+total);
}
public void withdraw(double amount){
    double totalbalance=balance-amount;
    System.out.println(" withdraw amount: "+amount+" New balance: "+totalbalance);


}

}
class SavingsAccount extends BankAccount {
    private double intRate;

    public SavingsAccount(int accountNumber, double balance, String accountHolderName, double intRate) {
        super(accountNumber, balance, accountHolderName);
    }

    public void deposit(double intRate, double balance, String accountHolderName, int accountNumber) {
        double total = balance * (1 + intRate);
        System.out.println("interest amount: " + total);


    }
}
    class CheckingAccount extends BankAccount {
        public CheckingAccount(int accountNumber, double balance, String accountHolderName) {
            super(accountNumber, balance, accountHolderName);
        }

        public void withdraw(double amount) {
            double totalbalance = balance - amount;
            System.out.println(" withdraw amount: " + amount + " New balance: " + totalbalance);

        }
    }

        class FixedDepositAccount extends BankAccount {
    private double paycheck;
            public FixedDepositAccount(int accountNumber, double balance, String accountHolderName, double intRate) {
                super(accountNumber, balance, accountHolderName);
            }


            public FixedDepositAccount(int accountNumber, double balance, String accountHolderName) {
                super(accountNumber, balance, accountHolderName);
            }
            @Override
            public void deposit(double paycheck){
                double total=balance+paycheck;
                System.out.println("Deposit amount: "+paycheck+"total balanca: "+total);
            }
        }