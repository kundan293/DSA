package Array;

import java.util.Scanner;

 class DecremetnArray {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  Array:");
        int n = sc.nextInt();
        int arr[] = new  int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }


    }
    public static int[] DecrementArrayEement(int [] arr ){
        int len = arr.length;
        for(int i=0; i<len;i++){
            arr[i]  = arr[i]-1;

        }
        return arr;
    }
}
