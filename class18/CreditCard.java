package class18;

public class CreditCard {

     void calculateInterest(double amount) {
        double interest=amount*0.05;
        System.out.println("Interest on "+amount+" is "+interest);
    }

}
    class AmEx extends CreditCard {

        public void calculateInterest(double amount) {
            double interest=amount*0.09;
            System.out.println("Interest on "+amount+" is "+interest);
        }
    }
    class Visa extends CreditCard{
    @Override
             void calculateInterest(double amount){
                 double interest=amount*0.07;
        System.out.println("Interest on "+amount+" is "+interest);
        }

        }
    class CreditCardTester{
        public static void main(String[] args) {
            AmEx amex=new AmEx();
            amex.calculateInterest(100);
            Visa1 v=new Visa1();
            v.calculateInterest(100);
        }

    }
