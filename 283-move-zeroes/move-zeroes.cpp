class Solution {
public:
    void moveZeroes(vector<int>& nums) {
      int insertPos = 0;

        for (int i = 0; i < nums.size(); i++) {
            // Check if the current value is NOT zero
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                
                insertPos++;
            }
        }  
    }
};