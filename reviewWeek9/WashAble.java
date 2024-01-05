package reviewWeek9;

public interface  WashAble {
    void wash();


}
interface TrustAble{
     default void trust(){

    }
}
class  Horse implements WashAble,TrustAble{
    @Override
    public void trust() {
        System.out.println(" ");
    }

    @Override
    public void wash() {
        System.out.println("Washing the Horse");
    }
}
class Car implements WashAble{

    @Override
    public void wash() {

    }
}
class Laptop{

}