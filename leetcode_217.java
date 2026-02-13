//217
//Contains Duplicate
/*Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct. */
import java.util.*;
class leetcode_217 {
    public static boolean containsDuplicate(int[] nums) {
        Set <Integer> num = new HashSet<>();
        for (int n : nums){
            if(num.contains(n)){
                return true;
            }
            num.add(n);
        }
        return false;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        
        System.out.println(containsDuplicate(nums));
    }
}