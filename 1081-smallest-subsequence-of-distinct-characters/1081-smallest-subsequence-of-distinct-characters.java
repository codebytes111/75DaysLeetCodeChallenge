class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        boolean arr[] = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']--;
            if(arr[ch-'a']){
                continue;
            }
            while(!st.isEmpty()&& st.peek()>ch && freq[st.peek()-'a']>0){
                arr[st.peek()-'a'] = false;
                    st.pop();
                }
                st.push(ch);
                arr[ch-'a'] =true;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<st.size();i++){
            ans.append(st.get(i));
        }
        return ans.toString();
    }
}