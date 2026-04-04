package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class LessThan {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  Arry:");
        int n = sc.nextInt();
        int arr[] = new  int[n];
        int k = 5;

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int [] result = LessThan(arr,k);
        System.out.println(Arrays.toString(result));

    }
        public static int[]LessThan(int[] arr, int k) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int num : arr){
                if(num < k) {
                    list.add(num);
                }
            }
            int [] result = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                result[i] = list.get(i);
            }
            return result;
        }
    }
