class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int dec = 0; 
        int asc = 0; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                dec++;
            }
            else if(nums[i]==target){
                asc++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<asc;i++){
            res.add(dec++);
        }
        return res;
    }
}