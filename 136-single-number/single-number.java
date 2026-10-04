class Solution {
    public int singleNumber(int[] nums) {
        // int result=0;
        // for(int i :nums){
        //   result^=i;   
        // }
        // return result;




        // 2nd method......................
        Map <Integer, Integer> count=new HashMap <>();
        // 1. Count frequency of each element
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        // 2. Find the element with a count of 1
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1;
            }
}