class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for (int n : nums1)
            ++count[n];
        int[] ans = new int[nums1.length];
        int k = 0;
        for (int n : nums2)
            if (count[n] > 0) {
                ans[k++] = n;
                --count[n];
            }
        return Arrays.copyOfRange(ans, 0, k);
    }
}