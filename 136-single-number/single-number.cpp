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


// In C++, auto tells the compiler to automatically deduce the data type of a variable from its initializer expression at compile time.

// When iterating over a map
// Using auto saves you from writing for (std::pair<const int, int> pair : counts).
// In C++, std::pair is a standard container structure used to hold two objects together as a single unit. It has two member variables:

// .first: Accesses the first element of the pair.

// .second: Accesses the second element of the pair.