package class22;

public class ProductIncapsulationTester {
    public static void main(String[] args) {
        ProductIncapsulation pi=new ProductIncapsulation("Halley","Ulker",150,1.5);
       pi.setStockQuantity(150);
       pi.restock(75);
       pi.sell(22);

        pi.printProductDetails();
    }
}
