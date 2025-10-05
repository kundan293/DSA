package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElement {
    public static  void main(String[] args) {
        int arr[] = {3,5,7,9,2};
       // for(int num : arr)
        int n = arr.length;
        System.out.println(kundan(arr , n));




    }
    public static int kundan (int arr[] , int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);

        }

        int  result = Collections.max(list);



        return result;
    }
}
