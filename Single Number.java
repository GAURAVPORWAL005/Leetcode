// Using Set

import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for(int i=0;i<nums.length;i++){
        if(sets.contains(nums[i])){
            sets.remove(nums[i]);
        }
            else{
              sets.add(nums[i]);
            }
            
            }
        return (int)(sets.toArray())[0];
        
    }
}
