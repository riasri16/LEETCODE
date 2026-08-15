class Solution {
public:
    bool isAnagram(string s, string t) {
       unordered_map<char,int> mp_s; 
       unordered_map<char,int> mp_ts; 
        if(s.size()!=t.size())
           return false;
        for(int i =0;i<s.size();i++){
         mp_s[s[i]]++;
         mp_ts[t[i]]++;
        }   
        for( char c : s){
            if(mp_s[c]!=mp_ts[c])
                 return false;
        }
        return true ;
        
    }
};