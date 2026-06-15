class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lowerBound = lb(nums,target);

        if(lowerBound==nums.length||nums[lowerBound]!=target){
            return new int[] {-1,-1};
        }
        int upperBound = ub(nums,target);

        return new int[] {lowerBound,upperBound-1};

    }
    public int lb(int nums[],int target){
        int low =0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]>=target) {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return ans;
    } 
    public int ub(int[] nums,int target){
        int low = 0;
       int high = nums.length-1;
        int ans = nums.length;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(nums[mid]>target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
} 
