class Solution {
public:
    int missingNumber(vector<int>& nums) {
// 1st...............................
    //     sort(nums.begin(),nums.end());
    //   for(int i =0;i<nums.size();i++){
    //     if(i!=nums[i]){
    //         return i;
    //     }
    //   } 
    //   return nums.size(); 
//  2nd.....................................
      int n = nums.size();
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
};