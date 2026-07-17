class Solution {
    public int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<directions.length();i++){
            boolean flag = true;
            char ch = directions.charAt(i);
            while(!st.isEmpty()){
                if(st.peek()=='R' && ch == 'L'){
                    st.pop();
                    ch = 'S';
                    count+=2;
                }
               else if(st.peek()=='S' && ch == 'L'){
                    ch = 'S';
                    count++;
                    break;
                }
                else if(st.peek()=='R' && ch == 'S'){
                    count++;
                    st.pop();
                }
                else{
                    break;
                }

            }
            st.push(ch);
        }
        return count;
    }
}