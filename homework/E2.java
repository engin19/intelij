package homework;

public class E2 {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries,
        // south america countries, europe countries, asian countries, african countries.
        // Then print all values from that
        // array using 2 different loops and calculate how many total countries been stored.
        String[][] countries={
                {"Canada","USA","","Mexico"},
                {"Colombia","Brazil","Peru","Venezuela","Chile"},
                {"Malta","France","Germany","Turkey"},
                {"Japan","Thailand","China","Cambodia","India"},
                {"Nigeria","Cameroon","South Africa","Ghana","Ethiopia"}
        };for (int i=0; i< countries.length;i++){
            for (int j=0; j<countries[i].length;j++)
        System.out.print(countries[i][j]+" ");
            System.out.println(" ");
    }

}
}
