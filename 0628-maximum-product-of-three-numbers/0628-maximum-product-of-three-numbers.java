class Solution {
    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        int tlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                tlargest = slargest;
                slargest = largest;
                largest = nums[i];
            }
            else if(nums[i]>slargest){
                tlargest = slargest;
                slargest = nums[i];
            }
            else{
                if(nums[i]>tlargest){
                    tlargest = nums[i];
                }
            }
            if(nums[i]<smallest){
                ssmallest = smallest;
                smallest = nums[i];

            }
            else if( nums[i] < ssmallest){
                ssmallest = nums[i];
            }
        }
        int product1 = largest * smallest * ssmallest;
        int product2 = largest * slargest * tlargest;
        
        return Math.max(product1,product2);
    }
}