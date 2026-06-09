class Solution {
    public int lengthOfLastWord(String s) {
        String[] n = s.trim().split(" ");
        return n[n.length-1].length();
    }
}