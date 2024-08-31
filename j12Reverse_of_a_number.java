package pushpak7numberprogramquation;

import java.util.Scanner;

public class j12Reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number want to Revers :");
        int n = sc.nextInt();
        int revers =0;
        while (n>0){
            int digit =n%10;
            revers=revers*10+digit;
            n/=10;

        }
        System.out.println(revers);

    }
}