class Solution {
    public void rotate(int[] nums, int k) {
    //  int n = nums.length;
    //     k = k % n; // Handle cases where k is greater than array length

    //     // Step 1: Reverse the entire array
    //     reverse(nums, 0, n - 1);

    //     // Step 2: Reverse the first k elements
    //     reverse(nums, 0, k - 1);

    //     // Step 3: Reverse the remaining n - k elements
    //     reverse(nums, k, n - 1);
    // }

    // private void reverse(int[] nums, int start, int end) {
    //     while (start < end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }   

    int n=nums.length;
    k%=n;
    rev(nums,0,n-1);
    rev(nums,0,k-1);
    rev(nums,k,n-1);
    }
    private void rev(int[]nums, int s , int e){
        int n =nums.length;
        while(s<e){
            int temp=nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            s++;
            e--;
        }
    }
}