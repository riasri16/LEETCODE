class Solution {
public:
    int trailingZeroes(int n) {
     
      int cxount=0; 
      while(n>0){
         n =n/5;
         cxount=cxount+n;
      }
      return cxount;
      }
      
    
};