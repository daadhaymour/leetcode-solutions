class Solution {
    public boolean isAnagram(String s, String t) {

        //if lengths are not equal it is automatically not an anagram
        if (s.length() != t.length()){
            return false;
        }

        //hashmap solution 

        HashMap<Character, Integer> countS = new HashMap<>();

        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            //add each element in array s and t into the hashmap
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i),0)+1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i),0)+1);

        }

        // return the computation of the comparison of hashamp counts and countt
        return countS.equals(countT);

        
    }
}
