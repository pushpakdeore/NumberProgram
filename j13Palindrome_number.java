package pushpak7numberprogramquation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class j13Palindrome_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int a =sc.nextInt();
        int revers =0;
        int original = a;//imp to store to check
        while (a!=0){
            int digit = a%10;
            revers =revers*10+digit;
            a =a/10;
        }
        if(original==revers){
            System.out.println(original+"is palindrome");
        }
        else {
            System.out.println(original+"is not palindrome");
        }

    }
}
