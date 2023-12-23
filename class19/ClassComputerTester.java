package class19;

public class ClassComputerTester {
    public static void main(String[] args) {
        ClassComputer[] arr={new Apple(),new Dell(),new HP(),new Lenovo() };
        for (int i = 0; i < arr.length ; i++) {
            arr[i].turnOn();
            arr[i].type();

        }
    }
}
