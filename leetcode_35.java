//035
//Search Insert Position
/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
 If not, return the index where it would be if it were inserted in order. */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // If target is not found
        return low;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;

        System.out.println(searchInsert(nums, target1)); // 2
        System.out.println(searchInsert(nums, target2)); // 1
        System.out.println(searchInsert(nums, target3)); // 4
        System.out.println(searchInsert(nums, target4)); // 0
    }
}
