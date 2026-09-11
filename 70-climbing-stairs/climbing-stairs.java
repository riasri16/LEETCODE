class Solution {
    public int climbStairs(int n) {
       if (n <= 2) return n;
       int prev2 = 1; // Ways to reach step 1
       int prev1 = 2; // Ways to reach step 2
       int current = 0;
       for(int i=3;i<=n;i++){
         current = prev1 + prev2; // Add ways from (i-1) and (i-2)
         prev2 = prev1;           // Shift prev2 forward
         prev1 = current;         // Shift prev1 forward
       }
         
       return current  ; 
    }
}