import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int a= input.nextInt();
       int b = input.nextInt();
char operator = input.next().charAt(0) ;
switch(operator){
    case '+' :
        System.out.println(a+b);
        break;
    case '-':
            System.out.println(a-b);
            break;
    case '*':
        System.out.println(a*b);
        break;
    case '/':
        System.out.println(a/b);
        break;
    case '%':
        System.out.println(a%b);

    default :
        System.out.println(" my calulatro is not advance because it support onle , +,-,*,%,/");


}

    }
}
