 // Question => https://leetcode.com/problems/longest-consecutive-sequence/submissions/
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i+1] - nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }
            else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                count =1;
            }
           
           
       
                
            
        }
        return max ;
    }
}
// TIme Complexity => O(logn)
