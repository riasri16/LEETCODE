class Solution {
    public boolean isAnagram(String s, String t) {
       Map<Character,Integer> mp_s = new HashMap<> (); 
       char[] ss=s.toCharArray();
       
        if(s.length()!=t.length())
           return false;
        for( char c :ss){
            mp_s.put(c,mp_s.getOrDefault(c,0)+1);
        }
        for(int i =0;i<s.length();i++){
         char c = t.charAt(i);
         if(!mp_s.containsKey(c) ||mp_s.get(c)==0){
            return false;
         }
         mp_s.put(c,mp_s.get(c)-1);
        }   
        
        return true ;
    }
}