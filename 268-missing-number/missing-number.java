class Solution {
    public int missingNumber(int[] nums) {
    //    1st best way,,,,,,,,,,,,,,,,,, 
    // int n = nums.length;
    //     int expectedSum = n * (n + 1) / 2;
    //     int actualSum = 0;
        
    //     for (int num : nums) {
    //         actualSum += num;
    //     }
        
    //     return expectedSum - actualSum;


    // 2nd .................................................
     Arrays.sort(nums);
     int n = nums.length;
      for(int i =0;i<n;i++){
        if(i!=nums[i]){
           return i;
        }
      } 
      return n; 
    }
} 
