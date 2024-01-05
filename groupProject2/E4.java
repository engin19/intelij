package groupProject2;

public class E4 {
    /*Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.*/
  /*  public static void main(String[] args) {
        String palindrome1="madam";
        String palindrome2="";
        for (int i = palindrome1.length()-1; i>=0; i--) {
            palindrome2=palindrome2+palindrome1.charAt(i);

            } if (palindrome2==palindrome1){
                System.out.println("This word is Palindrome");
            }else {
                System.out.println("This word is not Palindrome");

        }

    }*/
    public static void main(String[] args) {


        String a = "amadama";
        int start = 0;
        int end = a.length() - 1;
        while (start<end) {
              if (a.charAt(start)!=a.charAt(end) ) {
                  System.out.println("Not a Palindrome");
                  System.exit(0);
              }
              start++;
              end--;
        }

            System.out.println("Palindrome");
        }
    }


