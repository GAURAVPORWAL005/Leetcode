https://leetcode.com/problems/longest-common-prefix/

// optimized approach 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int c = 0;
        while(c < first.length()){
            if(first.charAt(c) != last.charAt(c)){
                break;
            }
            else{
                c++;
            }
        }
              return c == 0 ? "": first.substring(0,c);
    }
}

// time complexity => O(nlogn)

// brute force approach

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
// time complexity => O(n^2)
