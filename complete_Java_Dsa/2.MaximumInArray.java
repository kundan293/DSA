import java.util.Scanner;

 class MaximumInArray {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  Arry:");
        int n = sc.nextInt();
        int arr[] = new  int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        MaximumInArray obj = new  MaximumInArray();
        System.out.println("The maximum in  arry "+"="+obj.MaximumInArray(arr,n));




    }
    public  int MaximumInArray(int[] arr , int n){

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public static int  SumOf(int arr[] , int n){
          int  sum = 0;
          for(int i =0; i<n;i++){
              sum +=arr[i];
          }
          return  sum;
    }

}
