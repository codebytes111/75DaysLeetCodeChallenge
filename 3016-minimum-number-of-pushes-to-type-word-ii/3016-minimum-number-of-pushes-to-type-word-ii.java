class Solution {
    public int minimumPushes(String word) {
    int len = word.length();
        int count[] = new int[26];
        for(char ch : word.toCharArray()){
            count[ch-'a']++;
        }
        Arrays.sort(count);
        int total = 0;
        int push = 1;
        int used = 0;
        for(int i=25;i>=0;i--){
            if(count[i]==0) break;
            total+=count[i] * push;
            used++;
            if(used==8) push = 2;
            if(used==16) push = 3;
            if(used==24) push = 4;
        }
        
        return total;
    }
}