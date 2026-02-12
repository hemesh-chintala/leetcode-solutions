//611
//Valid Traingle
//given an array  of elements , find how many traingles can be formed: 


import java.util.Arrays;

class leetcode_611 {
    public static int countValidTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Step 1: Sort array
        Arrays.sort(arr);

        // Step 2: Fix the largest side one by one
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;

            // Step 3: Two-pointer approach
            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    // All elements between l and r will form valid triangles with arr[i]
                    count += (r - l);
                    r--; // Move right pointer
                } else {
                    l++; // Increase smaller side
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        System.out.println("Number of valid triangles: " + countValidTriangles(arr));
    }
}
