import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int a;
        int b;
        int product;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two number for multiplication");
     a = input.nextInt();
     b = input.nextInt();

     product = a*b;
        System.out.print(product);


    }
}
