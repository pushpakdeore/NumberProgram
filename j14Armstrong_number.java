package pushpak7numberprogramquation;
//Armstrong number : 153 =1*1*1+5*5*5+3*3*3
//370=3*3*3+7*7*7+0

import java.util.Scanner;

public class j14Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int temp = n;
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum =sum+digit*digit*digit;
            n/=10;
        }
        if(sum ==temp){
            System.out.println(temp+" is Armstrong");
        }else {
            System.out.println(temp+" is not Armstrong");
        }
    }
}
