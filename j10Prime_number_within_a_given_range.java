package pushpak7numberprogramquation;

import java.util.Scanner;

public class j10Prime_number_within_a_given_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =2,b=20;
        for(int n = a;n<=20;n++){
            if(isprime(n)){
                System.out.println(n);
            }
        }

    }

    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }
}
