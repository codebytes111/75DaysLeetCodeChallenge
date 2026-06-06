class Solution {
    public int majorityElement(int[] nums) {
        int n =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                n=nums[i];
            }
        if(nums[i]==n){
            count++;
        }
        else{
        count--;
        }
        }
        return n;
    }
}