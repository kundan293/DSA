import java.util.Scanner;
 class kundan {
    public static void main(String[] args) {
           Scanner sc = new  Scanner(System.in);
        System.out.println("Enter  the  size of the  Arry:");
        int n = sc.nextInt();
        int arr[] = new  int[n];

        for(int i = 0; i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("the  distnict  element"+ CountDist(arr , n));

    }
    public static int CountDist(int [] arr , int n){
        int  count = 0;
        boolean isDistinct = true;

        for(int i = 0; i<n;i++){
            for(int j =i-1; j>=0; j--){
                if(arr[i] == arr[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct ==true){
                count++;
            }
        }
        return count;
    }
}
