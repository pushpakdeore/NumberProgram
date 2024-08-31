package pushpak7numberprogramquation;

import java.util.Scanner;

//A Strong number is a number in which the sum of the
// factorials of its digits is equal to the number itself.
//145=1!+4!+5! is Strong number
public class j21Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to chek Strong Number:");
        int num= sc.nextInt();
        int orignalnum = num;//imp step at last te number become the 0 if not store
        int sum =0;
        while (num>0){
            int digit= num % 10;
            sum +=factorial(digit);
            num /=10;

        }
        if(orignalnum==sum){
            System.out.println(orignalnum+"is Stong number");
        }else {
            System.out.println(orignalnum+"is not Strong number");
        }
    }
    public static  int factorial(int n) {
        if(n==0 ||n==1){
            return 1;
        }
        return n*factorial(n-1);


    }
}
