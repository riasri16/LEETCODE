class Solution {
    public int majorityElement(int[] nums) {
    //   //cancel effect
    //  int leader=0;
    //  int votes=0;
    //  for(int n :nums){ //n =current number
    //      if(votes==0)
    //         leader=n;
    //      if(leader==n) 
    //         votes++;
    //      else
    //         votes--;
    //     }

    //   return leader; 
    int n =nums.length;   
    Map<Integer,Integer> mp=new HashMap<> ();
    for(int a :nums){
        mp.put(a,mp.getOrDefault(a,0)+1);
    }
    for(Map.Entry<Integer,Integer>m:mp.entrySet()){
        if(m.getValue()>(n/2)){
           return m.getKey();
        }
    }
    return -1;
    }
}