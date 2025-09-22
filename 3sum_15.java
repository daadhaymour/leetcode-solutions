class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> sum_combos = new ArrayList<>();

       for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){

                    if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> sum = new ArrayList<>();
                    sum.add(nums[i]);
                    sum.add(nums[j]);
                    sum.add(nums[k]);
                    if(!sum_combos.contains(sum)){
                    sum_combos.add(sum);
                    }
                    }
                        
                           
                    
                }
            }
       }
       return sum_combos;
}
}
