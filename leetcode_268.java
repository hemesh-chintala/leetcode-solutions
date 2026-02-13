//268
//Missing Number
/*Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array. */
import java.util.*;
class leetcode_268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int total=0;
        for(int i = 0;i<n;i++){
            total += nums[i];
        }    
        return (sum - total);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int res = missingNumber(nums);
        System.out.println(res);
    }
}