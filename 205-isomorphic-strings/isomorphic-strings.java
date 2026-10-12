class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int[] mapS = new int[256];
        // int[] mapT = new int[256];

        // for (int i = 0; i < s.length(); i++) {
        //     char charS = s.charAt(i);
        //     char charT = t.charAt(i);

        //     // If the last seen positions of the characters don't match, return false
        //     if (mapS[charS] != mapT[charT]) {
        //         return false;
        //     }

        //     // Store the position (i + 1 to distinguish from default value 0)
        //     mapS[charS] = i + 1;
        //     mapT[charT] = i + 1;
        // }
        // return true;



        // always 2 away mapping check hoti hai isomorphic mei ....
        Map<Character, Character> mapS2T = new HashMap<>();
        Map<Character, Character> mapT2S = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            // Agar c1 pehle se mapped hai, toh check karo ki wahi c2 se mapped hai ya nahi
            if (mapS2T.containsKey(c1) && mapS2T.get(c1) != c2) {
                return false;
            }
            // Agar c2 pehle se mapped hai, toh check karo ki wahi c1 se mapped hai ya nahi
            if (mapT2S.containsKey(c2) && mapT2S.get(c2) != c1) {
                return false;
                }
            
            mapS2T.put(c1, c2);
            mapT2S.put(c2, c1);
        }
        
        return true;
    }
}