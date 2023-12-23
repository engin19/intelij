package class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String word = "madam";
        String revword="";
        for (int i = word.length()- 1; i >= 0; i--) {
            revword = revword + word.charAt(i);}
            if (word.equalsIgnoreCase(revword)) {
                System.out.println("it is a palindrome");
                }else{
                    System.out.println("It is not a palindrome  ");


                }
                }
            }
