class Solution {
public:
    bool isPalindrome(int x) {
        // string s = to_string(x);
        // string reverse_number=s;
        // reverse(reverse_number.begin(), reverse_number.end());
        // return s==reverse_number;
        if( x<0)
          return false;
          int original=x;
          long long rev=0;
        while(x>0){
            rev=rev*10+x%10;
             x= x/10;
        }
        return original==rev;

     }  
    
};