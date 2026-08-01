class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> li = new ArrayList<>();
        int max = -1;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        int sum = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                li.add(true);
            }
            else{
            li.add(false);
            }
        }
        return li;
    }
}