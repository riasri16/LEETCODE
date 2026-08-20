class Solution {
public:
    bool isHappy(int n) {
        unordered_set<int> seen_already;
        while(n!=1){
            if(seen_already.count(n))
              return false;
            seen_already.insert(n);
            int s =0;
            while(n>0){
               s=s+pow(n%10,2);
                n=n/10;
             }

            if(n==0)
              n=s;
        }
        return true;
    }
};