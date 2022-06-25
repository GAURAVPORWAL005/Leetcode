// Quesiton => https://leetcode.com/problems/palindrome-partitioning/
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        findCombinations(0,s,new ArrayList<>(),ans);
        return ans;
    }
    
    public void findCombinations(int index, String s, List<String> path, List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                findCombinations(i+1,s,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
     
    public boolean isPalindrome(String s, int start, int end){
                while(start <= end){
                    if(s.charAt(start++) != s.charAt(end--)){
                        return false;
                    }
                }    
        return true;
        
        
    }
}
// Time complexity => O(2^n * n)
