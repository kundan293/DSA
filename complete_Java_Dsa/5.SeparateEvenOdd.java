package Array;

import java.util.Scanner;
import java.util.ArrayList;
 class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  array ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the  arry Element: ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();

        }
    }
    public static int[] evenOdd(int[] numbers){
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for(int num: numbers){
            if(num % 2 == 0){
                even.add(num);

            }else{
                odd.add(num);
            }
        }
        even.addAll(odd);
        int [] result = new int[even.size()];
        for(int i=0; i<even.size(); i++){
           result[i] = even.get(i);
        }
        return result;
    }
}
