// Question =>https://leetcode.com/problems/contiguous-array/submissions/
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLength = 0;    int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=  nums[i] == 1 ? 1 : -1;
            if(map.containsKey(sum))
            maxLength = Math.max(maxLength, i-map.get(sum));
              
            else
                map.put(sum,i);
            
        }
        return maxLength;
    }
}

// Time complexity => O(n)
