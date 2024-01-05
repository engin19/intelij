package groupProject2;

public class E9 {
    public static void main(String[] args) {
        String input="abracadabra";

        for (int i = 0; i <input.length() ; i++) {
            boolean repChar=true;
            for (int j = i+1; j <input.length() ; j++) {
                if (input.charAt(i) == input.charAt(j)) ;
                repChar = false;
                break;

            }
            if (repChar==true){
                System.out.println(input.charAt(i));
                break;
        }

        }
    }
}
