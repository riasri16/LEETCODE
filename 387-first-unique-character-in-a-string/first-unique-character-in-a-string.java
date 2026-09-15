class Solution {
    public int firstUniqChar(String s) {
    
       char[] sr = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<>();

        // 1. Fill frequency map
        for (char c : sr) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        // 2. Find first character with count == 1
        for (int i = 0; i < sr.length; i++) {
            if (mp.get(sr[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}