class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
      vector<unordered_set<char>> row(9);
      vector<unordered_set<char>> col(9);
      vector<unordered_set<char>> sub_box(9);
      for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]=='.')
                continue;
            char n=board[i][j];
            int b=(i/3)*3+(j/3);
            if(row[i].count(n) || col[j].count(n) ||sub_box[b].count(n))
                  return false;
            row[i].insert(n);
            col[j].insert(n); 
            sub_box[b].insert(n);         
        }
      }
      return true;
    }
};