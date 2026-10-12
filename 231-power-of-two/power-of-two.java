class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n==1)
          return true;
        long powerr=2;
        while(powerr<n){
            powerr=powerr*2;
            }
        
        return powerr==n;   
    }
}