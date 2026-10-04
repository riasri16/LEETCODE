class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> count=new HashMap<> ();
        for(int n : nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        for(int i =0;i<nums.length;i++){
            if(count.get(nums[i])>=2){
                return true;
            }
        }
        return false;
    }
}