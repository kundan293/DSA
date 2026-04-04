import java.util.Scanner;
 class BinaryTodecimal {
    public static void  bintoDec(int BinNum){
        int myNum = BinNum;

       int pow = 0;
       int decNum = 0;

       while(BinNum >0){
           int lastDigit = BinNum%10;
           decNum = decNum+(lastDigit *(int)Math.pow(2 ,pow ));

           pow++;
           BinNum = BinNum /10;

       }
        System.out.println("decimal of binary number"+ myNum+" = "+decNum);
    }
    public static void main(String[] args){
        int BinNum;
Scanner userInput = new Scanner(System.in);
        bintoDec(1000);


    }
}
