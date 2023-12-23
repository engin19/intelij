package class8;

public class E11EnhancedForLoop {
    public static void main(String[] args) {

            int[] numbers = {10, 15, 20, 18, 9, 60, 22,};
            int sume = 0, sumo = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    sume = sume + numbers[i];

                }
                if (numbers[i] % 2 == 1) {
                    sumo = sumo + numbers[i];
                }

            }
            System.out.println("sum of even numbers is "+ sume);
            System.out.println("sum of even numbers is "+sumo);
        }
    }
