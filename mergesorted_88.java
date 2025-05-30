class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

         int j = 0;


        //using library sort function to make things easier :p
        for(int i=m; i<m+n; i++){
            nums1[i] = nums2[j];
            j++;
            
        }

       Arrays.sort(nums1);
        
    }
}
