class Solution {
public:
    bool isPalindrome(string s) {
        int left=0;
        int right=s.size()-1;
        while(left<right){
            while (left<right && !isalnum(s[left])){    // skip non alphanumeric on left...
                left++;
            }
            while (left<right && !isalnum(s[right])){          // skip non alphnumeric on right.....
                right--;
            } 
            if(tolower(s[left])!=tolower(s[right])){
                   return false;
            }
            left++;
            right--;
               
        }
        return true;
        
    }
};