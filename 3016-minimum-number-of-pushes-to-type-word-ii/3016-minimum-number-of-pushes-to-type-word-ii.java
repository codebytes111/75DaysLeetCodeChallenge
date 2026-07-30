class Solution {
    public int minimumPushes(String word) {
    //     int count[] = new int[26];
    //    // HashMap<Character,Integer> map = new HashMap<>();
    //     for(char ch : word.toCharArray()){
    //         // if(map.containsKey(ch)){
    //         //     map.put(ch,map.getOrDefault(ch),1);
    //         // }
    //         count[ch-'a']++;
    //     }
    //     int total = 0;
    //     int unique = 0;
    //     for(int i=0; i<26;i++){
    //         if(count[i]!=0){
    //             unique++;
    //         }
    //         total+=count[i];
    //     }
    //     if(unique>8){
    //             total+=1;
    //         }
    //     return total;
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