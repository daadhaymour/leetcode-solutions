// https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeElement(int[] nums, int val) {

        //pointer 1
        int left = 0;

        for(int right=0; right<nums.length; right++){
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
        
    }
}
