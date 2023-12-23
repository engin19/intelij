package homework;

public class Prime {
    boolean isPrime(int number){
        boolean isPrime=false;
        if (number<2){
            return false;
        }
        for (int i = 2; i <=number/2 ; i++) {
            if (number%i==0){
                isPrime=true;
                break;
            }
        }
            if (!isPrime){
                return true;
            }else{
                return false;
            }
        }
}
