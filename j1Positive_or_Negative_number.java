package pushpak7numberprogramquation;

import java.util.Scanner;

public class j1Positive_or_Negative_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("positive Number");
        }
        else if (a<0) {
            System.out.println("Negative number");

        }
        else {
            System.out.println(" nUmber is Zero");
        }
    }

}
