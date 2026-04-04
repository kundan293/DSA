package Array;

import java.util.Scanner;

class CheckSortedArray {
     public static void main(String[] args) {
         Scanner sc = new  Scanner(System.in);
         System.out.println("Enter  the  size of the  array ");
         int n = sc.nextInt();
         int [] arr = new int[n];
         System.out.println("Enter the  array Element: ");
         for(int i=0; i<n ; i++) {
             arr[i] = sc.nextInt();
         }
     }
     public static boolean Sorted(int[] arr , int n){
          for(int i=1; i<n; i++){
              if(arr[i] == arr[i-1])
                  return true;
          }
          return false;
     }


 }