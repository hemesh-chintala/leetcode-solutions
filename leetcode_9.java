//09
//Palindrome Number

import java.util.Scanner;

class leetcode_9 {
    public static boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x >0){
            int digits=x%10;
            sum = (sum*10)+digits;
            x /=10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
        
        sc.close();
    }
}
