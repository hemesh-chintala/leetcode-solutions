//976
//Largest Perimeter Triangle
//we have given an array of values we have return an largest perimeter formed by the triangles - if no triangle is formed then return 0

import java.util.Arrays;

class largestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums); 

        
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        
        return 0;
    }

    public static void main(String[] args) {
        
        largestPerimeterTriangle s=new largestPerimeterTriangle();
        int[] nums={2,1,2};
        System.out.println(s.largestPerimeter(nums));
    }
}
