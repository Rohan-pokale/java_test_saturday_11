package java_test_saturday_11;

public class Q_3_swap_using_third_variable {
     public static void main(String[] args) {
          int a = 6;
          int b = 8;
          System.out.println("before swapping : a=" + a + " b=" + b);
          int c = a;
          a = b;
          b = c;
          System.out.println("after swapping : a=" + a + " b=" + b);
     }
}
