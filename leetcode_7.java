import java.util.*;

public class leetcode_7 {

    public static int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;

            // Check 32-bit overflow
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }

            x = x / 10;
        }

        return (int) rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        System.out.println(reverse(x));
        
        sc.close();
    }
}
