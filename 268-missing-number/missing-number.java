// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         int result=0;
//         if(nums[0] != 0){
//             return 0;
//         }
//         else if(n <=1){
//             result=nums[0]+1;
//         }
//         for(int i=0;i<=n;i++){
//             if(i+1<n && nums[i+1] != nums[i]+1){
//                 result= nums[i]+1;
//                 break;
//             }
//             else if(i+1<n && nums[i+1]==nums[i]+1){
//                 result=n;
//             }
//         }
//         return result;
//     }
// }

// or
class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            sum2 = sum2 + nums[i];
        }
        return sum1 - sum2;
    }
}