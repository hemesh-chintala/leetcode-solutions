//2221
//Triangle Sum of an array
// We have given an array of elements, we have to find the tiag=ngular sum array
/* for example 1,2,3,4,5:
    1 2 3 4 5
     3 5 7 9
      8 2 6
       0 8
        8
 */

class TraingleSumArray {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        
        for (int len = n; len > 1; len--) {
            for (int i = 0; i < len - 1; i++) {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
        }
        
        return nums[0]; 
    }

    public static void main(String[] args) {
        TraingleSumArray sol = new TraingleSumArray();
        int[] nums = {1,2,3,4,5};
        System.out.println(sol.triangularSum(nums)); 
    }
}
