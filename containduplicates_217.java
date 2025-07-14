class Solution {
    public boolean containsDuplicate(int[] nums) {

        //boolean variable to store if duplicate found or not

        boolean duplicate = false;

        // nested for loop, first for loop chooses an element, second for loop chekcs for duplicate

        for (int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){ //j=i+1 so that an element isnt compared to itself 
                if (nums[i] == nums[j]){
                    duplicate = true;
                    break;
                }
            }
        }

        return duplicate;
        
    }
}
