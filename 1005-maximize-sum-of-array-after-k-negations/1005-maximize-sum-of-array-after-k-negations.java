class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0 && k>0){
                nums[i] = -nums[i];
                k--;
            }
        }
        if(k%2==0){
        for(int i = 0;i<nums.length;i++){
          ans+=nums[i];
        }
        }
        else{
            int min = Integer.MAX_VALUE;
            for(int num:nums){
                min = Math.min(min,num);
                ans+=num;
            }
            ans-=2*min;
        }
    return ans;
}
    }