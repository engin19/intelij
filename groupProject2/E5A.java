package groupProject2;

import java.util.Arrays;

public class E5A {

    /* public static void main(String[] args) {
         String str1 = "listen";
         String str2 = "silent";
         for (int i = 0; i <str1.length(); i++) {
             for (int j = 0; j <str1.length()- 1; j++) {
                 if (str1.charAt(i)==str2.charAt(j)){
                     System.out.println(str1 + " and " + str2 + " are  anagrams");
                     break;
                 }if (str1.charAt(i)!=str2.charAt(j)) {
                     System.out.println(str1 + " and " + str2 + " are not anagrams");
                 }
             }
         }
     }
}*/
    static class Alt {
        public static void main(String[] args) {
            String a = "silent";
            String b = "listen";
            a = a.toLowerCase();
            b = b.toLowerCase();
            if (a.length() == b.length()) {
                char[] charArray1 = a.toCharArray();
                char[] charArray2 = b.toCharArray();
                for (char[] chars : Arrays.asList(charArray1, charArray2)) {
                    Arrays.sort(chars);
                }
                boolean result = Arrays.equals(charArray1, charArray2);
                if (result) {
                    System.out.println(a + " and " + b + " are anagrams");
                } else {
                    System.out.println(a + " and " + b + " are not anagrams");
                }

            } else {
                System.out.println("This is not an anagram");
            }
        }
    }
}