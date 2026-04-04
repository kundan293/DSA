package String;

public class ConvertUpperCase {
    public static void main(String[] args)
    {
        String s = " Hello ";
        ConvertCase(s);

    }
    public static void ConvertCase(String s ){

        String FirstCapital = s.substring(0,1).toUpperCase() + s.substring(1);   //  this is  convert  the  First  letter  of  String
        System.out.println(FirstCapital);
        System.out.println(s.toUpperCase());




    }
}
