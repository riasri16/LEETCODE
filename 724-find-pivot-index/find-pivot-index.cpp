class Solution {
public:
    int pivotIndex(vector<int>& nums) {
     int leftsum=0; 
       int rightsum=0; 
       int sum=0;
       for(int i=0;i<nums.size();i++){
         sum+=nums[i];
       }
       
       for(int i=0;i<nums.size();i++){
        if(i>0){
            leftsum+=nums[i-1];
        }
        
        rightsum=sum-leftsum-nums[i];
        if(leftsum==rightsum){
            return i;
        }
       }
       return -1;   
        
    }
};