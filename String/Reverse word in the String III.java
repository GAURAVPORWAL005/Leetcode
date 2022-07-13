https://leetcode.com/problems/reverse-words-in-a-string-iii/
// using built in functions
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            words[i] = new StringBuffer(words[i]).reverse().toString();
        }
        return String.join(" ",words);
    }
}
// time complexity => o(n * m)


// optimized Appraoch

class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        for(; end < chars.length;end++){
            if(chars[end] == ' '){
                reverseWord(chars, start,end-1);
                start = end + 1;
            }
        }
        reverseWord(chars,start,end-1);
        return new String(chars);
    }
    public void reverseWord(char[] chars, int start, int end){
        while(start < end){
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}
// time complexity => O(n)
