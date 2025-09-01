class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int end=nums.length-1;
        int i=0;
        while(i<=end){
            if(nums[i]==0){
                swap(nums,i,mid);
                    i++;
                    mid++;
            }
            else if(nums[i]==2){
                swap(nums,i,end);
                end--;
            }
            else{
                i++;
            }
        }
    }
        private static void swap(int[] nums,int num1,int num2){
            int temp=nums[num1];
            nums[num1]=nums[num2];
            nums[num2]=temp;
        }
}