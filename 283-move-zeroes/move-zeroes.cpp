class Solution {
public:
    void moveZeroes(vector<int>& nums) {
      int insertPos = 0;

        for (int i = 0; i < nums.size(); i++) {
            // Check if the current value is NOT zero
            if (nums[i] != 0) {
                int temp = nums[insertPos];
               
                nums[insertPos] =nums[i] ;
                 nums[i] = temp;
                
                insertPos++;
            }
        }  
    }
};