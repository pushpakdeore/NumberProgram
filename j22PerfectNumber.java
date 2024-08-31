package pushpak7numberprogramquation;

import java.util.Scanner;
//6,28,496 are perfect number 6=1+2=3,28=1,2,4,7
//perfect number is number sum of divisor is equal to number
public class j22PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Chek is Perfect Number or not");
        int n = sc.nextInt();
        int sum =0;

        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum){
            System.out.println(n+" is Perfect number ");
        }else {
            System.out.println(n+"is not perfect number");
        }
    }

}
