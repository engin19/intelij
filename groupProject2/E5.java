package groupProject2;

public class E5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (str2.contains("l") && str2.contains("i")&&str2.contains("t")&&str2.contains("s")&& str2.contains("e")&& str2.contains("n")) {
            System.out.println(str1 + " and " + str2 + " are  anagrams");
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}