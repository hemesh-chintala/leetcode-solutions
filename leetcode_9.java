//09
//Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
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
}
