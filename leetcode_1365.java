//1365
//How many numbers are smaller than the current number
/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array. */
import java.util.*;
class leetcode_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count =0;
        int n= nums.length;
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            count =0;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                    count++;
                    
                }

            }
            arr[i]=count;
        }
        return arr;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] res = smallerNumbersThanCurrent(nums);
        System.out.println(res);
    }
}