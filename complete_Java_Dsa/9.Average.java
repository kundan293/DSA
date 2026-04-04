package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  Arry:");
        int n = sc.nextInt();
        int arr[] = new  int[n];
        int k = 5;

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int [] result = new posAverage(arr);
        System.out.println(Arrays.toString(result));

    }
    public static double posAverage(int[] arr) {
        double sum = 0;
        int count = 0;
        int sum = 0, count = 0;
        for (int num : arr) {
            if (num >= 0) {
                sum += num;
                count++;
            }
        }
        return count == 0 ? 0.0 : (double) sum / count;

    }
}
