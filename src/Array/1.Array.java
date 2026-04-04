package Array;

// Array by refrence
import java.util.Scanner;
 class Array {
     static void update(int marks[]) {
         for (int i = 0; i < marks.length; i++) {
             System.out.println(marks[i] + 1);
         }
     }
     public static void main(String[] args) {
         int marks[] = {90, 92, 94, 96, 99};

         update(marks);
         for (int i = 0; i < marks.length; i++) {

             System.out.print(marks[i] + " ");
         }
         System.out.println();
     }
 }


