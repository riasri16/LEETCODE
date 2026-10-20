class Solution {
    public boolean isPalindrome(String s) {
    //   int left=0;
    //   int right=s.length()-1;
    //   while(left<right){
    //         while (left<right && !Character.isLetterOrDigit(s.charAt(left))){    // skip non alphanumeric on left...
    //             left++;
    //         }
    //         while (left<right && !Character.isLetterOrDigit(s.charAt(right))){          // skip non alphnumeric on right.....
    //             right--;
    //         } 
    //         if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
    //                return false;
    //         }
    //         left++;
    //         right--;
               
    //     }
    //     return true;  
    int l =0;
    int r =s.length()-1;
    while(l<r){
        while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
            l++;
        }
        while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
            r--;
        }
        if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
            return false;
        }
        l++;
        r--;
    }
    return true;
    }
}