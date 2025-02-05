import java.util.*;
class BST {
    public static int BinarySerach(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
     int number[]={2,5,7,3,23,8};
     int key=2;
        System.out.println("index for key is: "+BinarySerach( number, key));
    }
}
