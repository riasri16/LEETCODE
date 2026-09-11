class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen_already=new HashSet<> ();
        while(n!=1){
            if(seen_already.contains(n))
              return false;
            seen_already.add(n);
            int s =0;
            while(n>0){
               int digit =n%10;
               s=s+(digit*digit);
                n=n/10;
             }

            if(n==0)
              n=s;
        }
        return true;
        
    }
}