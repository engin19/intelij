package homework;

public class E1SecondMethod {
    public static void main(String[] args) {
        String[][] list = {
                {"Strawberry", "Apple", "Grape", "Peach"},
                {"Spinach", "Beans", "Eggplant", "Tomatoes"},
                {"Moz. Cheese", "Feta Cheese", "Eggs", "Yogurt"},
                {"Baklava", "Tiramisu", "Chocolate", "Cheesecake"}

        };for (String[] abc:list){
            for (String grocery:abc)
            System.out.print(grocery+" ");
            System.out.println(" ");
        }
}
        }