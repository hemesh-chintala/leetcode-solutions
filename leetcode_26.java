//026
//Remove Duplicates From the Sorted Array
/*Given an integer array nums sorted in non-decreasing order,
     remove the duplicates in-place such that each unique element appears only once. 
            The relative order of the elements should be kept the same. */

class leetcode_26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int k = 1; // index for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Main method for testing
    public static void main(String[] args) {
        leetcode_26 sol = new leetcode_26();

        int[] nums = {1, 1, 2, 2, 3};

        int result = sol.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + result);
        System.out.print("Updated array: ");

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
