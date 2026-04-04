package Array;

import java.util.Scanner;

class ArrayTraversalReverse {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  Array:");
        int n = sc.nextInt();
        int arr[] = new  int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }


    }
    public  static  void Traversal(int [] arr, int n){
        for(int i = 0; i<n; i++){
            if(i == n && i == 0){
                System.out.print("\"");
            }
            System.out.print(arr[i]+" ");
        }
    }

}
