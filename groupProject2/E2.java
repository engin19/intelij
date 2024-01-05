package groupProject2;

public class E2 {
    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string?
        String string1="ASDP11111112345666666666!@#$%^&*()_FGHasertghjulj12345!@#$%^&*";

        String str=string1.replaceAll("[^A-Za-z]","");
        System.out.println(str.length());




    }
    }


