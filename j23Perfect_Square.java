package pushpak7numberprogramquation;

import java.util.Scanner;

///25,16,9,4 is perfect square 5*5=25
public class j23Perfect_Square {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number to Check is perfect Square");
        int num =sc.nextInt();
        double sqrt =Math.sqrt(num);
//        System.out.println(sqrt);
        if(sqrt==(int)sqrt){
            System.out.println(num+"is perfect square");
        }else {
            System.out.println(num+"is not Perfect Square");
        }

    }
}
