package pushpak7numberprogramquation;

import java.util.Scanner;

public class j4Sum_of_N_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        int sum =0;
        for(int i =1; i<=n;i++){
            sum +=i;
        }
        System.out.println("the sum of first "+n+" natural number is :"+sum);
    }
}
