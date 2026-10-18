class Solution {
    public String reverseWords(String s) {
     char[] arr=s.toCharArray();
     int a =0;
      int b=0;
     while(a <arr.length){
         
        while(a <arr.length && arr[a]!=' '){
           a++;
        }
        rev(arr,b,a-1);
    //    while (a < arr.length && arr[a] == ' ') {
    //             a++;
    //         }
    b=a+1;
    a++;
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