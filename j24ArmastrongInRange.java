package pushpak7numberprogramquation;

public class j24ArmastrongInRange {
    public static void main(String[] args) {
        int a = 10;
        int b = 1000;
        for (int i = a; i < b; i++) {
            if (isarmstromg(i)) {
                System.out.println(i);
            }

        }
    }

    public static boolean isarmstromg(int i) {
        int sum = 0;
        int temp = i;
        while (i > 0) {
            int digit = i % 10;
            sum += digit * digit * digit;
            i /= 10;
        }
        if(sum==temp){
            return true;
        }return false;
    }
}
