package class18;

public class CreditCard {

    public void interest() {
        System.out.println("10%");
    }

}
    class AmEx extends CreditCard {

        public void interest() {
            System.out.println("10%");
        }
    }
    class Visa extends CreditCard{
            public void interest(){
        System.out.println("8%");
        }

        }
    class CreditCardTester{
        public static void main(String[] args) {
            AmEx amex=new AmEx();
            amex.interest();
            Visa1 v=new Visa1();
            v.interest();
        }

    }
