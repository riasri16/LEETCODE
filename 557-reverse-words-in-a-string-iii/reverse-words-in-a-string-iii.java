class Solution {
    public String reverseWords(String s) {
     char[] arr=s.toCharArray();
     int a =0;
      int b;
     while(a <arr.length){
         b=a;
        while(a <arr.length && arr[a]!=' '){
           a++;
        }
        rev(arr,b,a-1);
       while (a < arr.length && arr[a] == ' ') {
                a++;
            }
     }
     return new String(arr);
}
private void rev(char[] arr, int a , int b){
   while(a<b) {char temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
    a++;
    b--;}
} 
}