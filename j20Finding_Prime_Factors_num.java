package pushpak7numberprogramquation;
import java.util.Scanner;
public class j20Finding_Prime_Factors_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for(int i =2;i<=number;i++){
            if(number%i==0){
                if(isprime(i)){
                    System.out.println(i);
                }
            }
        }
    }
    public static  boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }


}