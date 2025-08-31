class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target <=nums[0]){
            return 0;
        }
        int left=0;
        int rigth=nums.length-1;

        while(left <= rigth){
            int mid=(left+rigth)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                rigth=mid-1;
            }
            else{
                return mid;
            }
        }
        return left;
    }
}