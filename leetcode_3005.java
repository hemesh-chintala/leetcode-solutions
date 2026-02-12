//3005
//Count Elements With Maximum Frequency


import java.util.*;

class leetcode_3005 {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
       
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        
        int maxFreq = 0;
        for (int f : freq.values()) {
            maxFreq = Math.max(maxFreq, f);
        }
        
        
        int total = 0;
        for (int f : freq.values()) {
            if (f == maxFreq) total += f;
        }
        
        return total;
    }

    public static void main(String[] args) {
        leetcode_3005 sol = new leetcode_3005();
        int[] nums = {1,2,2,3,2,3,1,4};
        System.out.println(sol.maxFrequencyElements(nums)); 
    }
}
