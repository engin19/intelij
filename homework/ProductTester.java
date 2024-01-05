package homework;

public class ProductTester {
    public static void main(String[] args) {
        Product p1=new Books(60,"Java for Dummies",123456,0.0625);
        Product p2=new Clothing (50,"PRL",75,0.0825);
        Product p3=new Electronics(1250,"Refrigerator",2568,0.05);
        Product p4=new Furniture(2500,"Dining table",85542,0.0725);
        p1.calculateTax(60,0.0625);
        p2.calculateTax(50,0.0825);
        p3.calculateTax(1250,0.05);
        p3.appWar(1250,150);
        p4.calculateTax(2500,0.0725);

    }
}
