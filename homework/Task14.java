package homework;

public class Task14 {
   char grade(int a) {
       if (a >= 90 && a <= 100) {
           return 'A';
       } else if (a >= 80 && a <= 89) {
           return 'B';
       } else if (a >= 70 && a <= 79) {
           return 'C';
       } else if (a >= 60 && a <= 69) {
           return 'D';
       } else  {
           return'F';
       }

   }
}
