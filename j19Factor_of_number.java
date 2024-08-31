package pushpak7numberprogramquation;

import java.util.Scanner;

public class j19Factor_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find factor :");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+" ");

            }
        }
    }
}
