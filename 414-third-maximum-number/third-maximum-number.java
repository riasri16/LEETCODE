class Solution {
    public int thirdMax(int[] nums) {
    //    Integer first = null;
    //     Integer second = null;
    //     Integer third = null;

    //     for (Integer num : nums) {
    //         // Skip duplicates
    //         if (num.equals(first) || num.equals(second) || num.equals(third)) {
    //             continue;
    //         }

    //         if (first == null || num > first) {
    //             third = second;
    //             second = first;
    //             first = num;
    //         } else if (second == null || num > second) {
    //             third = second;
    //             second = num;
    //         } else if (third == null || num > third) {
    //             third = num;
    //         }
    //     }

    //     return third != null ? third : first; 
    long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        // Return third maximum if set, otherwise return global maximum
        return third != Long.MIN_VALUE ? (int) third : (int) first;
    }
}