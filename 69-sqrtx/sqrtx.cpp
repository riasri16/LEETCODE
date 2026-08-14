class Solution {
public:
    int sqrt(int l,int h,int x){
        if(l>h)
          return h;
        long long mid=(l+h)/2;
        if(mid*mid==x)
          return mid;
        if(mid*mid<x)
          return sqrt(mid+1,h,x);
        else
           return sqrt(l,mid-1,x);
    }
    int mySqrt(int x) {
        
        return sqrt(0,x,x);
    }
};