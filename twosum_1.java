class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] sum = {0,0};

        //using nested for loop to ensure we get all possible sums

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if ((nums[i]+nums[j])==target){
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }

        return sum;

        
    }
}
