package java_test_saturday_11;

public class Q_1_reverse_number {
     public static void main(String[] args) {
          int no = 132;
          int rev = 0;
          while (no != 0) {
               int rem = no % 10;
               rev = rev * 10 + rem;
               no = no / 10;
          }
          System.out.println(rev);
     }
}
