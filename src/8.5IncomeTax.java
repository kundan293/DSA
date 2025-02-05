import java.util.Scanner;
class IncomeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long income = input.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;


        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);

        } else {
            tax = (int) (income * 0.3);

        }
        System.out.println("your tax is " + tax);
    }

}

