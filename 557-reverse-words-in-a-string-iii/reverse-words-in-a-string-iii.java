class Solution {
    public String reverseWords(String s) {
     char[] arr=s.toCharArray();
        int i =0;
        int j =0;
        
        while(i<arr.length){
            while(i<arr.length && arr[i]!=' '){
                i++;
            }
            reverse(arr,j,i-1);
            j=i+1;
            i++;

        }
        return new String(arr);
    }
    // Helper method to swap characters in place
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
}
}