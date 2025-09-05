class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>(); // value in array -> number of occurances

        for(int num:nums){

            count.put(num, count.getOrDefault(num,0)+1);

        }

        //add each value -> #of occurances into a List of integers

        List<int[]> arr = new ArrayList<>();

        //loop through hashmap
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){

            arr.add(new int[]{entry.getValue(), entry.getKey()});

        }

        arr.sort((a,b) -> b[0] - a[0]);

        int[] freq = new int[k];

        for(int i=0; i<k; i++){
            freq[i] = arr.get(i)[1]; //get value
        }
        return freq;

        





        
    }
}
