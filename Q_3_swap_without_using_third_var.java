package java_test_saturday_11;

public class Q_3_swap_without_using_third_var {
     public static void main(String[] args) {
          int a = 6;
          int b = 8;
          System.out.println("before swapping : a=" + a + " b=" + b);

          a = a + b;
          b = a - b;
          a = a - b;

          System.out.println("after swapping : a=" + a + " b=" + b);
     }
}
