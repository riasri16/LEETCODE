class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char,string> mp1; // this map pattern to s str
        unordered_map<string,char> mp2; //    this map s str to pattern char
        stringstream ss(s);
        vector <string> words ;
        string w;
        while(ss >> w){
            words.push_back(w);
        }
        if(words.size()!=pattern.size())
            return false;

        for (int i =0;i<pattern.size();i++){
            if(mp1.count(pattern[i]) && mp1[pattern[i]] !=words[i])
               return false;
            if(mp2.count(words[i])  && mp2[words[i]]!=pattern[i])
                    return false;
            mp1[pattern[i]]=words[i];
            mp2[words[i]]=pattern[i];
        }
        return true ;
    }
};