class Solution {
public:
    int singleNumber(vector<int>& nums) {
    //    1st method.......................
        // int result=0;
        // for(int i :nums){
        //   result^=i;   
        // }
        // return result;

        // 2nd method..............................

        unordered_map<int, int> count;
        
        // Count frequency of each element
        for (int num : nums) {
            count[num]++;
        }
        
        // Find the element with a count of 1
        for (auto pair : count) {
            if (pair.second == 1) {
                return pair.first;
            }
        }
        
        return -1;
    }
};