class Solution {
    public String reverseVowels(String s) {
        
      char[] arr = s.toCharArray();
        int b = 0;
        int e = arr.length - 1;

        while (b < e) {
            // Move left pointer until a vowel is found
            while (b < e && !isVowel(arr[b])) {
                b++;
            }
            // Move right pointer until a vowel is found
            while (b < e && !isVowel(arr[e])) {
                e--;
            }

            // Swap the vowels
            if (b < e) {
                char temp = arr[b];
                arr[b] = arr[e];
                arr[e] = temp;
                b++;
                e--; // Decrement right pointer
            }
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        char p = Character.toLowerCase(c);
        return p == 'a' || p == 'e' || p == 'i' || p == 'o' || p== 'u' ;
    }
}