// Quesiton => https://leetcode.com/problems/shuffle-string/
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        for(int i=0;i<indices.length;i++){
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }
}
// time complexity => O(n)
