//11
//Container With Most Water


class ContainerWithmostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Current area
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            // Move pointer for smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    
    public static void main(String[] args) {
        ContainerWithmostWater sol = new ContainerWithmostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max area: " + sol.maxArea(height)); 
    }
}
