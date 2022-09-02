https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        String first = new String(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        String second  = new String(tArray);
        return first.equals(second);
    }
}
// time complexity => O(nlogn)
// space complexity .
