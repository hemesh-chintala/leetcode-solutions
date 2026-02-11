//01
//Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class leetcode_1 {
    public int[] twoSum(int[] nums, int target) {
        //int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length && i!=j ;j++){
                     if(nums[i]+nums[j]==target){
                      int arr[]={i,j};
                      return arr;
                     }
            }
           
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        leetcode_1 sol = new leetcode_1();
        int[] nums = {2,7,11,15};
        int target = 9;
        int res[] = sol.twoSum(nums, target);
        System.out.println(res);
    }
}
