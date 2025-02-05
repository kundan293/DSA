import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            int n = input.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.print(n);
        } while(true);
    }
}
