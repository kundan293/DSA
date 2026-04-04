import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class SumNNUmber {
     public static void main(String[] args) {
          System.out.println();
          Scanner input = new Scanner(System.in);
          System.out.println("please enter your number: ");
          int n = input.nextInt();
          int sum = 0;

          int i = 1;
          while (i <= n) {
               sum = sum + i;
              i++;
          }

          // System.out.println(sum)
     }
}
