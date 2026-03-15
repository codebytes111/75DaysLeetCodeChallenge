class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> li = new ArrayList<>();
       int index;
       for(int i = 0; i<nums.length; i++){
        index = Math.abs(nums[i]) - 1;
        nums[index] = -Math.abs(nums[index]);
       }
       for(int i = 0 ; i<nums.length; i++){
        if(nums[i] > 0){
            index = i + 1;
            li.add(index);
        }
       }

       return li;
    }
}