import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst(); // safely removes and returns smallest (no exception)
            }
        }

        // If less than 3 distinct numbers, return max
        if (set.size() < 3) {
            return set.last();
        }

        // Else return the third maximum
        return set.first();
    }
}
