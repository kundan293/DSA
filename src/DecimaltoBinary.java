public class DecimaltoBinary {

    public static void decimalTobinary(int  DecNum)
    {
        int myNum = DecNum;
        int  Pow = 0;
        int  rem ;
        int  bin  = 0;
        while(DecNum >0){
            rem = DecNum %2;
            bin = bin+(rem*(int)Math.pow(10,Pow));
                    Pow ++;
                    DecNum = DecNum/2;
        }
        System.out.println("Binary numer is ="+ myNum+"="+ bin);
    }
    public static void main(String[] args)
    {
decimalTobinary(5);

    }
}
