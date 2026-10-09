class Solution {
    public int findPeakElement(int[] nums) {
        // Optimal O(log n)  Solution (Binary Search)
       int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1; // Peak is on the right side
            } else {
                right = mid;     // Peak is on the left side (or at mid)
            }
        }
        
        return left; 
    }
}


// Approach 2: Linear Scan with Edge Handling ($O(n)$)
// int n = nums.length;
        
//         // Single element array is always a peak
//         if (n == 1) return 0;
        
//         // Check first element (left boundary boundary constraint: nums[-1] = -∞)
//         if (nums[0] > nums[1]) return 0;
        
//         // Check last element (right boundary constraint: nums[n] = -∞)
//         if (nums[n - 1] > nums[n - 2]) return n - 1;
        
//         // Check middle elements
//         for (int i = 1; i < n - 1; i++) {
//             if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
//                 return i;
//             }
//         }
        
//         return -1;