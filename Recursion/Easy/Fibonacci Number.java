class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
// Time complexity O(n)
// Space complexity => O(1)
