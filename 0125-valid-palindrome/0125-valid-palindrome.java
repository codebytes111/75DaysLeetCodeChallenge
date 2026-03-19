class Solution {
    public boolean isPalindrome(String s) {
        String ch = s.toLowerCase();
                int left = 0;
                int right = ch.length()-1;
                while(left < right){
                char l = ch.charAt(left);
                char r = ch.charAt(right);
                if(!Character.isLetterOrDigit(l)) {
                    left++;
                    continue;
                }
                if(!Character.isLetterOrDigit(r)){
                    right--;
                    continue;
                }
                if(l!=r){
                    return false;
                }
                left ++;
                right --;

                }
                return true;
    }
}