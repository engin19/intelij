package class22;

public class ProductIncapsulation {
    private String productID;
    private String name;
    private int StockQuantity;
    private double price;

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return StockQuantity;
    }

    public double getPrice() {
        return price;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setStockQuantity(int stockQuantity) {
        StockQuantity = stockQuantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductIncapsulation(String productID, String name, int stockQuantity, double price) {
        this.productID = productID;
        this.name = name;
        this.StockQuantity = stockQuantity;
        this.price = price;

        }
        void restock(int amount){
        StockQuantity=StockQuantity+amount;
            System.out.println("We have restocked "+amount+" of "+name+" total number of "+name+" is now:"+StockQuantity);

        }
        void sell(int amount){
        StockQuantity=StockQuantity-amount;
            System.out.println("Today we have "+StockQuantity+" of "+name+" left.");

        }
        void printProductDetails(){
            System.out.println(name+" "+productID+" "+price+" "+StockQuantity);
        }
    }
