https://leetcode.com/problems/reverse-string-ii/
class Solution {
    public String reverseStr(String s, int k) {
        int i = 0;
     char[] chars = s.toCharArray();
        while(i < chars.length){
            
            int end = i + k -1;
            if(end > chars.length-1){
                end = chars.length-1;
            }
            reverse(chars,i,end);
            i = i + (k*2);
        }
        return new String(chars);
    }
    public void reverse(char[] chars, int i, int end){
        while(i <= end){
            char temp = chars[i];
            chars[i++] = chars[end];
            chars[end--] = temp;
        }
    }
}
