package InterviewQuestions;

public class Q2 {
    public static void main(String[] args) {
        //*2. Find out how many alpha characters are present in a string?

        String str="7623467kdsnfskjdASDSJD!#@$#";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());
    }
}
