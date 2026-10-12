class Solution {
    public boolean isSubsequence(String s, String t) {
      int left1=0;
      int left2=0;
      while(left1<s.length() && left2<t.length()){
            if(s.charAt(left1)==t.charAt(left2)){
                left1++;
                left2++;
            }
            else{
                left2++;
            }
        }
       return left1==s.length();  
    }
}