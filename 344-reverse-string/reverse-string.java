class Solution {
    public void reverseString(char[] s) {
        // int left=0;
        // int right=s.length-1;
        // while(left<right){
        //     char temp=s[left];
        //     s[left]=s[right];
        //     s[right]=temp;
        //     left++;
        //     right--;
        // }
        int b =s.length-1;
        int i=0;
        while(i<=b){
            char temp=s[b];
            
            s[b]=s[i];
            s[i]=temp;
            i++;
            b--;
        }
    }
}