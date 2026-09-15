class Solution {
public:
    int firstUniqChar(string s) {
      // C++ HashMap (equivalent to Java's HashMap<Character, Integer>)
        unordered_map<char, int> count;

        // First pass: count frequency of each character
        for (char c : s) {
            count[c]++;
        }

        // Second pass: find the first character with a count of 1
        for (int i = 0; i < s.size(); i++) {
            if (count[s[i]] == 1) {
                return i;
            }
        }

        return -1;
     
    }
};