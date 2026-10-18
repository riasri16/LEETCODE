class Solution {
    public String reverseStr(String s, int k) {
        char[] arr= s.toCharArray();
        for(int i =0;i<arr.length;i+=2*k){
            int a =i;
            int b =Math.min(i+k-1,arr.length-1);
            rev(arr,a, b);
        }
        return new String(arr);
    }
    private void rev(char[] arr,int a , int b){
        while(a<b){
            char temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}