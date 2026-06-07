class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int cur=num;
                int streak=1;
        while(set.contains(cur+1)){
            cur++;
            streak++;
        }
        longest=Math.max(longest,streak);
            }
        }
        return longest;
    }
}