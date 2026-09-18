class Solution {
// Helper method to swap characters in place
 void reverse(string& s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

public:
    string reverseWords(string s) {
        
        int i =0;
        int j =0;
        
        while(i<s.size()){
            while(i<s.size() && s[i]!=' '){
                i++;
            }
            reverse(s,j,i-1);
            j=i+1;
            i++;

        }
        return s;
    }
    
};