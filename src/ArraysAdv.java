import java.util.Scanner;
class ArraysAdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println(" enter the size of array: ");
        int size = input.nextInt();
        int a[] = new int[size];
       System.out.print(" please enter the array element: ");

        for(int i=0; i<size; i++){

            a[i] = input.nextInt();

        }
        for(int i=0; i<size; i++){
            System.out.print(+a[i]);
        }
input.close();
    }
}