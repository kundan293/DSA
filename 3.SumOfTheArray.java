import java.util.Scanner;

 class SumOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  Arry:");
        int n = sc.nextInt();
        int arr[] = new  int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the sum of  the  array is  "+SumOf(arr,n));
    }
    public static int  SumOf(int arr[] , int n){
        int  sum = 0;
        for(int i =0; i<n;i++){
            sum +=arr[i];
        }
        return  sum;
    }
}
