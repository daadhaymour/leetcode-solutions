class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new  int[nums.length];
        int value = 1;


        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i!=j){
                    value *= nums[j];
                }
                if(j == nums.length-1){
                    answer[i] = value;
                    value = 1;
                }
            }
        }

        return answer;


        
    }
}
