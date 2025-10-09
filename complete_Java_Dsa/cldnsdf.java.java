import java.util.*;
 class Average
{
    public static void main(String[] args) {
        Scanner sc =  new  Scanner(System.in);
        System.out.println("enter the  size of the  array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter element");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }



    }
    public static  void Sum(int a[] , int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum +=a[i];
        }
        int  result = sum /n;
        System.out.println("the  average  su of  the  arry is "+result);
    }
}

// ldfmm
// klmldfmd
// kmdlgfmm