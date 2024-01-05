package groupProject2;

public class E3 {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string. For example,
        //given the input "Hello", the output should be "olleH".
        String string1="Hello";
        String string2="";

        for (int i =string1.length()-1; i >=0; i--) {
            string2=string2+string1.charAt(i);


        }System.out.println(string2);
    }
}
