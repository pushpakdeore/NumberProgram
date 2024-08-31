package pushpak7numberprogramquation;

import java.util.Scanner;

public class j2Even_or_Odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd :");
        int a =sc.nextInt();
        if (a%2==0) {
            System.out.println("even "+a);
        }
        else {
            System.out.println("odd "+a);
        }

    }
}
