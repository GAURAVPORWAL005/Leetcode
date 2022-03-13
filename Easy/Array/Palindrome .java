// Question => https://leetcode.com/problems/valid-palindrome/submissions/

class Solution {
    public boolean isPalindrome(String s) {
        String newString=removeAllNonAlphaNumericCharacters(s);
        int leftPtr=0;
        int rightPtr=newString.length()-1;
        
        while(leftPtr<rightPtr){
            if(newString.charAt(leftPtr)!=newString.charAt(rightPtr)){
                return false;
            }
            leftPtr++;
            rightPtr--;
        }
        return true;
        
    }
    
   
    public String removeAllNonAlphaNumericCharacters(String s){
        StringBuilder charString=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') 
               ||(c >= '0' && c <= '9')){
                charString.append(Character.toLowerCase(c));
            }
        }
        return charString.toString();
    }
}
