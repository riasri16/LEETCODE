class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Sort the array alphabetically
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        String ans = "";

        // Compare characters of first and last strings
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            ans += first.charAt(i);
        }

        return ans;
    }
}



// // Option 1: StringBuilder (Best performance inside loops)
// StringBuilder ans = new StringBuilder();
// ans.append(first.charAt(i));

// // Option 2: String with += (Simplest, like C++)
// String ans = "";
// ans += first.charAt(i);

// // Option 3: String with concat() (Needs reassignment, less efficient)
// String ans = "";
// ans = ans.concat(String.valueOf(first.charAt(i)));