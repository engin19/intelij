package homework;
/*3)E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.

Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes.
December 19, 2023

* */
public abstract class Product {
    int price;
    String name;
    double SKU,taxRate;
    Product(int price, String name, double SKU, double taxRate){
        this.name=name;
        this.SKU=SKU;
        this.price=price;
        this.taxRate=taxRate;
    }

    public void appWar(int price, int war){
        System.out.println();


    }
    public void   calculateTax(){
        System.out.println(" We multiply the price with tax rate to find the total price ");
    }

    public abstract void   calculateTax(int price, double taxRate);
}
class Electronics extends Product {
    int war;
    int total = price + war;

    Electronics(int price, String name, double SKU, double taxRate) {
        super(price, name, SKU, taxRate);
    }


    int total1= (int) (price*(1+taxRate));
@Override

    public void   calculateTax(int price,double taxRate){
        System.out.println("Total price of your Clothing is "+total1);
    }
    public void appWar(int price,int war){
        System.out.println("If you want to add an extended warranty to your electronics  total price would be "+(total+war));

    }
}
class Clothing extends Product{
    int total= (int) (price*(1+taxRate));

    Clothing(int price, String name, double SKU, double taxRate) {
        super(price, name, SKU, taxRate);
    }

    public void   calculateTax(int price,double taxRate){
        System.out.println("Total price of your Clothing is "+total);
    }
}
class Furniture extends Product{
    int total= (int) (price*(1+taxRate));

    Furniture(int price, String name, double SKU, double taxRate) {
        super(price, name, SKU, taxRate);
    }

    public void   calculateTax(int price,double taxRate){
        System.out.println(" Total price of your Clothing is "+total );
    }
}
class Books extends Product{
    int total= (int) (price*(1+taxRate));

    Books(int price, String name, double SKU, double taxRate) {
        super(price, name, SKU, taxRate);
    }

    public void   calculateTax(int price, double taxRate){
        System.out.println(" Total price of your Clothing is "+total );
    }
}
