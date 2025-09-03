class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indices = new HashMap<>(); //value -> index

        //for loop to fill the hashmap with the values and indices
        for(int i=0; i<nums.length; i++){
            indices.put(nums[i], i);
        }

        //for loop to find the two indices that sum = target

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];//create diff value

            /**if the indices hashmap has diff as a key, and the index of the diff value is not the
            same as i, then we have 2 distinct indices that's values sum to target
            - return an integer array containing i and value of diff (using .get() function)
            */
            if(indices.containsKey(diff) && indices.get(diff)!=i){
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];//just for the purpose of having a return statement at the end of this method     
    
}
}
