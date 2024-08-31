package pushpak7numberprogramquation;

import java.util.Scanner;

public class j5Sum_of_numbers_in_a_given_range {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range from where to start :");
        int a= sc.nextInt();
        System.out.println("enter the range from where to end :");
        int b= sc.nextInt();
        int sum = 0;
        for(int i =a; i<=b;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
