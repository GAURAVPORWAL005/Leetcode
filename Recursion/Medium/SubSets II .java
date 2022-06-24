// QUestion => https://leetcode.com/problems/subsets-ii/
class Solution {
    public void subSet(int i, int[] nums,List<List<Integer>> list, List<Integer> ds){
        list.add(new ArrayList<>(ds));
        for(int index = i; index < nums.length;index++){
            if(index != i && nums[index] == nums[index-1])
                continue;
            ds.add(nums[index]);
            subSet(index+1, nums, list,ds);
            ds.remove(ds.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        subSet(0,nums,list,new ArrayList<Integer>());
        return list;
    }
}
// Time complexity => O(2^n * n)
