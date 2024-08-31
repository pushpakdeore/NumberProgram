package pushpak7numberprogramquation;
//Find the Nth Term of the Fibonacci Series :
import java.util.Scanner;
public class j16Find_the_Nth_Term_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term number (N): ");
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nthTerm = 0;

        if (n == 1) {
            nthTerm = firstTerm;
        } else if (n == 2) {
            nthTerm = secondTerm;
        } else {
            for (int i = 3; i <= n; ++i) {
                nthTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nthTerm;
            }
        }

        System.out.println("The " + n + "th term in the Fibonacci series is: " + nthTerm);

        scanner.close();
    }
}

