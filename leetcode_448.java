//448
//Find all the numbers Dissapeared int array
/*Given an array nums of n integers where nums[i] is in the range [1, n],
 return an array of all the integers in the range [1, n] that do not appear in nums. */
import java.util.*;
 class Main {
    public static List<Integer> findDisappearedNumbers(List<Integer> nums) {
        Set<Integer> num = new HashSet<>();
        for (int i : nums){
            num.add(i);
        }
        List<Integer> arr = new ArrayList<>();
        int n = nums.size();
        for(int i = 1;i<= n;i++){
            if(!num.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            nums.add(x);
        }
        List<Integer> res = findDisappearedNumbers(nums);
        System.out.println(res);
    }
}