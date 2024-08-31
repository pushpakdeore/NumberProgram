package pushpak7numberprogramquation;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class j9Prime_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number to check prime number or not");
        int a = sc.nextInt();
        boolean isprime =true;
        if(a<=1){
            isprime = false;
        }
        else {
            for(int i =2; i<=a/2;i++){//imp a/2
                if(a%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if (isprime){
            System.out.println(a+ " is prime");
        }
        else {
            System.out.println(a+ " not prime");
        }



    }


}
