package pushpak7numberprogramquation;

import java.util.Scanner;

public class j11Sum_of_digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number wich you want to sum :");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            sum = sum+num%10;
            num = num/10;
        }
        System.out.println("the sum of digit is:"+sum);
    }
}
