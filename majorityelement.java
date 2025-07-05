//https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150

//got it first try lets goooooo idc if the solution is not optimal
class Solution {
    public int majorityElement(int[] nums) {

        int m_elem = -1000000000;
        int n = nums.length;


        for (int i=0; i<n; i++){
            int nums_e=0;

            for(int j=0; j<n; j++){
                if (nums[i] == nums[j]){
                    nums_e++;
                    m_elem = nums[i];
                }
            }
            if(nums_e > (n/2)){
                break;
            }
        }

        return m_elem;
}
}
