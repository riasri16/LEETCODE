class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n==1)
          return true;
        long long powerr=1;
        while(powerr<n){
            powerr=powerr*2;
            }
        if(powerr==n)
               return true;
        return false;   
    }
};