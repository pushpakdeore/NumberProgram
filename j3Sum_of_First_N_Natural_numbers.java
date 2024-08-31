package pushpak7numberprogramquation;

import java.util.Scanner;

public class j3Sum_of_First_N_Natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=1;
        System.out.println("enter the number for sum of natural number :");
        int n = sc.nextInt();
        sum = n*(n+1)/2;
        System.out.println("the sum of first "+n+ " natural numberis :"+sum);

    }
}
