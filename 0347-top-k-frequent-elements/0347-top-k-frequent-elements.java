class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
            map.put(nums[i],map.get(nums[i])+1);
            }
        }
            for(int key : map.keySet()){
                int freq = map.get(key);

                if(bucket[freq] == null){
                    bucket[freq] = new ArrayList<>();
                }
                bucket[freq].add(key);
            }
        int index = 0;
        for(int i=bucket.length-1; i>0 && index < k; i--){
            if(bucket[i]!= null){
                for(int num : bucket[i]){
                    ans[index++]=num;
                    if(index == k){
                        break;
                    }
                }
            }
        }
         return ans;   
    }
} 