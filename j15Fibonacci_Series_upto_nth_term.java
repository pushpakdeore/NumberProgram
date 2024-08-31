package pushpak7numberprogramquation;

import java.util.Scanner;

public class j15Fibonacci_Series_upto_nth_term {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fistTerm =0;
        int secondTerm=1;
        System.out.print("fibonacci seris:");
        for(int i =1; i<=n;++i){
            System.out.print(fistTerm+" ");
            int nextTerm = fistTerm+secondTerm;
            fistTerm = secondTerm;
            secondTerm=nextTerm;
        }

    }
}
