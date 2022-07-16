https://leetcode.com/problems/di-string-match/
class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length()+1];
        int start = 0;
        int end = s.length();
        for(int i=0;i<ans.length-1;i++){
            if(s.charAt(i) == 'I'){
                ans[i] = start;
                start++;
            }
            else{
                ans[i] = end;
                end--;
            }
        }
        ans[ans.length-1] = start;
        return ans;
    }
}
// time complexity => O(n)
