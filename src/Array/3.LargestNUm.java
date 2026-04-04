package Array;
import java.util.*;
import java.util.*;

class LargestNum {
    public static int getLargestArrayNumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        System.out.println("The smallest value is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 3, 2, 9};
        System.out.println("The largest value is: " + getLargestArrayNumber(number));
    }
}
