https://leetcode.com/problems/reverse-string/

// brute force Appraoch
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end){
          char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
// time complexity => O(n)

// optimized approach
class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
}
// time complexity=> O(n)
