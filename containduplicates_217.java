class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet(); // use hash set to check for duplicates by recording the     numbers we have already seen

        for(int num:nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }

        return false;

        
    }
}
