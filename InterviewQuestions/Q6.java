package InterviewQuestions;

public class Q6 {
    public static void main(String[] args) {

        String str="documentation";
        System.out.println(str.replaceAll("[^aeiouAEIOU]","").length());
        StringBuilder sb=new StringBuilder("Syntax"); sb.append("Solutions"); System.out.println(sb);

    }
}
