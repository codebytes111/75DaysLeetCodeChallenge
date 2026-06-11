class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            int fre = 0;
            int num = 0;
        for(int key : map.keySet()){
            if(map.get(key)>fre){
                fre = map.get(key);
                num=key;
            }
        }
        result[i] = num;
        map.remove(num);
    }
    return result;
    }
}