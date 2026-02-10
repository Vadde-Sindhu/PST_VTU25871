class Solution {
    public void moveZeroes(int[] nums) {
        int lastnonzero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[lastnonzero];
                nums[lastnonzero]=nums[i];
                nums[i]=temp;
                lastnonzero++;
            }
        }
    }
}
