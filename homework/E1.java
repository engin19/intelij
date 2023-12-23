package homework;

public class E1 {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        //Retrieve all values from that array using 2 different loops
        String[][] list={
                {"Strawberry","Apple","Grape","Peach"},
                {"Spinach","Beans","Eggplant","Tomatoes"},
                {"Moz. Cheese","Feta Cheese","Eggs","Yogurt"},
                {"Baklava","Tiramisu","Chocolate","Cheesecake"}


        };    for (int i=0; i< list.length;i++) {
            for (int j = 0; j < list[i].length; j++)


                System.out.print(list[i][j] + " ");
            System.out.println(" ");

        }
        }
        





    }

