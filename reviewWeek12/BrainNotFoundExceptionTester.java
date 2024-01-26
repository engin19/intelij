package reviewWeek12;

public class BrainNotFoundExceptionTester {
    public static void main(String[] args) {

            BrainNotFoundException brainNotFound=new BrainNotFoundException("Please make sure You have your brain");
            throw  brainNotFound;
        }
    }

