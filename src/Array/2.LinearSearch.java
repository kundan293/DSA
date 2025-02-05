package Array;
import java.util.Scanner;
class LinearSearch {
    public static int linearSearch( int number[] , int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] = {3,2,5,6,8,9,0};
        for(int i=1; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the key : ");
        int key = input.nextInt();
        int index = LinearSearch.linearSearch(number, key);
        if(index ==-1){
            System.out.println(" key is not found");
        }else{
            System.out.println(" key is found index is" +index );
        }

    }
}
