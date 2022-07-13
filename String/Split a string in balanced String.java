https://leetcode.com/problems/split-a-string-in-balanced-strings/
class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
          
          // Increment the sum when L is found
            if(s.charAt(i) == 'L'){
                sum++;
            }
            else{
          // Otherwise decrement the sum 
                sum--;
            }
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}

// time complexity => O(n)
