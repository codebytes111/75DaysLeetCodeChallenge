class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
            map.put(n,1);
            }
        }
        for(int count : map.values()){
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }
}