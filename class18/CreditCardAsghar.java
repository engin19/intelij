package class18;

public class CreditCardAsghar {

        void calculateInterest(double amount){
            double interest=amount*0.05;
            System.out.println("Interest on "+amount+" is "+interest);
        }
    }

    class Visa1 extends CreditCard{

        void calculateInterest(double amount) {
            double interest=amount*0.07;
            System.out.println("Interest on "+amount+" is "+interest);
        }
    }
    class AX extends CreditCard{
        @Override
        public void interest() {
            super.interest();
        }

        void calculateInterest(double amount) {
            double interest=amount*0.09;
            System.out.println("Interest on "+amount+" is "+interest);
        }
    }

    class CreditCardTester1{
        public static void main(String[] args) {
            AX ax=new AX();
            ax.calculateInterest(100);
            Visa1 v=new Visa1();
            v.calculateInterest(100);
        }
    }

