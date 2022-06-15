// Question => https://leetcode.com/problems/longest-substring-without-repeating-characters/

// brute force Approach using two nested loops

// Better Approach
// Using sets sets does not  contain repeating character
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxCount = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(left++);
            }
                  set.add(s.charAt(i));
                          maxCount = Math.max(maxCount, i-left + 1);
        }
        return maxCount;
    }
}
// Time complexity => O(2n)

// Optimized Appraoch
// we store the character and integer in the hashmap
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int n = s.length();
        int len = 0;
        while(right < n){
            if(map.containsKey(s.charAt(right))){
                 left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
            
        }
        return len;
    }
}
// Time Complexity => O(n)
