package pushpak7numberprogramquation;

import java.util.Scanner;

public class j17Factorial_of_a_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the to find factorial :");
        int n = sc.nextInt();
        int fac = 1;
        for(int i = 1;i<=n;++i){
            fac= fac*i;
        }
        System.out.println(fac);


    }
}
