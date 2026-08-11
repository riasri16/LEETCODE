class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int n =matrix.size();
        int m =matrix[0].size();
         bool impactedrow=false;
         bool impactedcol=false;
        //check  first impacted row nd col...
        for (int i=0;i<m;i++){
            if (matrix[0][i]==0)
               impactedrow=true;
        }
        for (int j=0;j<n;j++){
            if (matrix[j][0]==0)
               impactedcol=true;
        }
        //check remaining row nd col....
             
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0 ){
                      matrix[i][j]=0;}
            }          
        }
        if(impactedrow){
          for(int j =0;j<m;j++){
            matrix[0][j]=0;
            
          }
          
        }
        if(impactedcol){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
         
                 
        }
          
           
    }
};