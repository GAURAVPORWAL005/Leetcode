// Question => https://leetcode.com/problems/third-maximum-number/submissions/
class Solution {
    public int thirdMax(int[] nums) {
     int max=0;
        int count=0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
          if(!list.contains(nums[i]))
              {
                  list.add(nums[i]);
                  count++;
                  max=Math.max(max,nums[i]);  
              }
              
              if(count==3)
              {
                  return nums[i];   
              } 
        }
        
        return max;
    }
}

// Time Complexity => O(n).
