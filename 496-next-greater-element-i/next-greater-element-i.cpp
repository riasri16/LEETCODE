class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int, int> mp;
        stack<int> st;
        // nums2 mein har element ka next greater find karo
        for (int i = nums2.size() - 1; i >= 0; i--) {

            // Chhote/equal elements useless hain
            while (!st.empty() && st.top() <= nums2[i]) {
                st.pop();
            }
            // Stack empty → greater element nahi hai
            if (st.empty())
                mp[nums2[i]] = -1;
            else
                mp[nums2[i]] = st.top();
            // Current element ko stack mein daalo
            st.push(nums2[i]);
        }
        // nums1 ke answers nikalo
        vector<int> ans;
        for (int x : nums1) {
            ans.push_back(mp[x]);
        }
        return ans;
    }
};