class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            boolean flag = true;
                while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                    if(st.peek() == Math.abs(asteroids[i])) {
                        st.pop();
                        flag = false;
                        break;
                    }
                else if(st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
        }
                if(flag){
                    st.push(asteroids[i]);
                }
    }  
    int[] ans = new int[st.size()];
    int i = st.size() - 1; 
     while(!st.isEmpty()){
            ans[i]=st.pop();
            i--;
        }

        return ans;
    }
}