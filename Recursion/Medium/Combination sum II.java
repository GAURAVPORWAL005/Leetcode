// Question => https://leetcode.com/problems/combination-sum-ii/submissions/
class Solution {
    
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(candidates);
        findCombination(0,candidates,target,res,new ArrayList<>());
        
        return res;
    }
    
    public void findCombination(int idx,int[] candidates,int target,List<List<Integer>> res,List<Integer> ans){
            if(target== 0){
                res.add(new ArrayList<>(ans));
            }
        
            for(int i = idx;i<candidates.length;i++){
                if(i>idx && candidates[i] == candidates[i-1]){
                    continue;  
                } 
                else if(target<candidates[i]){
                    return;
                }else{
                    ans.add(candidates[i]);
                    findCombination(i+1,candidates,target-candidates[i],res,ans);
                    ans.remove(ans.size()-1);
                }
            }
        
    }
}

// Time complexity => O(2^n * k)
