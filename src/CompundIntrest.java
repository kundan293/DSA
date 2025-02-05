import java.util.Scanner;

public class CompundIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the principal amount (P)
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Get the annual interest rate (r) in percentage
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        // Convert the percentage to decimal
        rate = rate / 100;

        // Get the number of times interest is compounded per year (n)
        System.out.print("Enter the number of times the interest is compounded per year: ");
        int n = scanner.nextInt();

        // Get the number of years (t)
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate compound interest using the formula
        double amount = principal * Math.pow((1 + rate / n), n * years);

        // Calculate the compound interest (final amount - principal)
        double compoundInterest = amount - principal;

        // Output the results
        System.out.println("Amount after " + years + " years: " + amount);
        System.out.println("Compound Interest: " + compoundInterest);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }

}
