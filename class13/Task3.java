package class13;

public class Task3 {
    void isPalindrome(String a){
        String palindrome="a";
        for (int i = a.length()-1; i>=0; i--) {
            palindrome=palindrome+a.charAt(i);
        }
        if(a.equalsIgnoreCase(a)){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }
    }
}
