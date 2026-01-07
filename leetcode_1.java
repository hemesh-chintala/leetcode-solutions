class Solution {
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
}
