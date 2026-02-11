//027
//Remove Element
/* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.*/
class leetcode_27 {

   
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

   
    public static void main(String[] args) {
        leetcode_27 sol = new leetcode_27();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int result = sol.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + result);
        System.out.print("Updated array: ");

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
