package InterviewQuestions;

public class Q3 {
    public static void main(String[] args) {
        /*3. Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH".*/

        String str="Hello";
        String newStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            newStr=newStr+str.charAt(i);
        }
        System.out.println(newStr);
    }
}
