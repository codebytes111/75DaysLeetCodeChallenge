class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char key:map.keySet()){
            if(map.get(key)!=0){
                return key;
            }
        }
       return ' ';
    }
}