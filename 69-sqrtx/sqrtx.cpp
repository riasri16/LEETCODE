class Solution {
public:
    int mySqrt(int x) {
        if (x < 2) return x; // Handle 0 and 1 base cases directly

        int l = 1, h = x;
        int ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            
            // Cast to long long to prevent integer overflow during mid * mid
            if ((long long)mid * mid <= x) {
                ans = mid;    // Record valid floor answer
                l = mid + 1;  // Try to find a larger answer
            } else {
                h = mid - 1;  // Shrink search space
            }
        }

        return ans;
    }
};