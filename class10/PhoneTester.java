package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.color="Silver";
        phone.make="Apple";
        phone.model="15 Pro";
        phone.price=1200;
        phone.call();
        phone.camera();
        phone.VideoCall();
        System.out.println(phone.color);
        System.out.println(phone.price);
        System.out.println(phone.model);
        System.out.println(phone.make);


    }
}
