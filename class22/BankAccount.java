package class22;

public class BankAccount {
    private double balance;
    private String userName,password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Login to bank Account");
    }
    void transferFund(){
        System.out.println("Transfering funds");
    }
    void resetPassword(){
        System.out.println("Resetting the password");
    }
    double getBalance(){
        return balance;
    }
    String getUserName(){
        return userName;
    }
    String getPassword(){
        return password;
    }
    void setBalance(double balance){
        this.balance=balance;
    }
    void setUserName(String userName){
        this.userName=userName;

    }
void setPassword(String password){
        this.password=password;
}

}
