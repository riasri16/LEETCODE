class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        // Process blocks of size 2 * k
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            // Cap the right pointer to stay within array bounds
            int right = Math.min(i + k - 1, arr.length - 1);
            
            // Reverse the first k characters of this block
            reverse(arr, left, right);
        }
        
        return new String(arr);
    }

    // Helper method to swap characters in place
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}