class Solution {
    public String smallestPalindrome(String s) {
        int count[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
                count[ch - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i]/2;j++){
                left.append((char)(i+'a'));
            }
            if(count[i]%2==1){
                middle.append((char)(i+'a'));
            }
        }
        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle.toString() + right;
    }
}