class Solution {
public:
    int reverse(int x) {
        long rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        // Check for 32-bit signed integer overflow
        if (rev < INT_MIN || rev > INT_MAX) {
            return 0;
        }
        return (int)rev; //// Casts 64-bit 'long' down to 32-bit 'int'
    
    }
};