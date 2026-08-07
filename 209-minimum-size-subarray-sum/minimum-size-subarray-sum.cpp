class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int left_p=0;
        int sum= 0;
        int ans =INT_MAX;
        for(int right_p=0;right_p<nums.size();right_p++){
            sum+=nums[right_p];
            while(sum>=target){
                ans=min(ans,right_p-left_p+1);
                sum-=nums[left_p];
                left_p++;
            }
        }
        return ans == INT_MAX ? 0:ans;
    }
};