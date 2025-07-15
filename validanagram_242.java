class Solution {
    public boolean isAnagram(String s, String t) {
        //if the lengths are different then it's automatically not an anagram
        if(s.length() != t.length()){
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);

        Arrays.sort(tSort);

        //check if each element in sorted s and t arrays are the same
        return Arrays.equals(sSort, tSort);

        





        
    }
}
