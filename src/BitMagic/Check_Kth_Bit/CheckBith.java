package BitMagic.Check_Kth_Bit;
import java.util.*;
public class Java {
    public  static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Entere the  element n = ");
        int n = sc.nextInt();
        System.out.print("Enter the Kth Bit = ");
        int k = sc.nextInt();

        System.out.println(  checkkthBit(n , k));

    }
    public  static boolean checkkthBit(int n , int k){

        return (n&(1<<k)) !=0;



    }
}
