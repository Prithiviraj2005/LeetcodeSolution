import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                k++;
            } else if (nums[i] > k) {
                while (k < nums[i]) {
                    ans.add(k);
                    k++;
                }
                k++;
            }
        }
        
        // Add any remaining numbers after the loop
        while (k <= nums.length) {
            ans.add(k);
            k++;
        }
        
        return ans;
    }
}