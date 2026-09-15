class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        // Sort the strings alphabetically
        sort(strs.begin(), strs.end());

        string first = strs[0];
        string last =strs[strs.size()-1];
        string ans = "";

        // Compare characters of first and last strings
        for (int i = 0; i < first.size(); i++) {
            if (first[i] != last[i]) {
                break;
            }
            ans += first[i];
        }

        return ans;
    }
};