class Solution {
    public int majorityElement(int[] nums) {
      //cancel effect
     int leader=0;
     int votes=0;
     for(int n :nums){ //n =current number
         if(votes==0)
            leader=n;
         if(leader==n) 
            votes++;
         else
            votes--;
        }

      return leader;    
    }
}