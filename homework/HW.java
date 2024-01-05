package homework;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "listen";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if (str1.length() == str2.length() && Arrays.equals(charArray1, charArray2)) {
            System.out.println(str1 + "  " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }


}
