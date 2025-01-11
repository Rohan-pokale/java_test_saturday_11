package java_test_saturday_11;

public class Q4_number {
     public static void main(String[] args) {
          int no = 5696;
          int number = 0;
          String str_no = "";
          while (no != 0) {
               int rem = no % 10;
               number = rem + 2;
               if (number > 10) {
                    number = 1;
               }
               str_no = str_no + number;
               no = no / 10;
          }
          number = Integer.parseInt(str_no);

          int rev = 0;
          while (number != 0) {
               int rem = number % 10;
               rev = rev * 10 + rem;
               number = number / 10;
          }
          System.out.println(rev);

     }
}
