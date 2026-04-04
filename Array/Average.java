package Array;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double avg = posAverage(arr);

        System.out.println("Average of positive numbers: " + avg);
    }

    public static double posAverage(int[] arr) {
        double sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) return 0.0; // No positive numbers
        return sum / count;
    }
}
