class Solution {
    public int findPeakElement(int[] nums) {
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