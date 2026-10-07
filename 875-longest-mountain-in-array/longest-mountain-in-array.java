class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 1; i < n - 1; i++) {
            // Step 1: Check if arr[i] is a peak
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                // Step 2: Expand left down the mountain
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // Step 3: Expand right down the mountain
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Step 4: Calculate mountain length and update maximum
                int currentLen = right - left + 1;
                maxLen = Math.max(maxLen, currentLen);
                
                // Jump index to the end of the current mountain
                i = right; 
            }
        }

        return maxLen;
    }
}