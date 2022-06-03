class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = prices[0];
        for(int i=1;i<prices.length;i++){
            if(curr > prices[i]){
            curr = prices[i];
            }
            else{
            int pro = prices[i] - curr;
                max = Math.max(pro,max);
            }
        }
        return max;
    }
    
}

// Time complexity = O(n);
