class Solution {
    public void f(char s[],int i,int n){
        if(i>=n/2) return;
        swap(s,i,n-i-1);
        f(s,i+1,n);
    }
    public void swap(char[] s,int i,int n){
        char temp = s[i];
        s[i] = s[n];
        s[n] = temp;
    }
    public void reverseString(char[] s) {
        int n = s.length;
        f(s,0,n);
    }
}