class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while(i<n1 && j < n2){
            if(nums1[i] < nums2[j]) i++;
            else if(nums2[j] < nums1[i]) j++;
            else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[ans.size()];
        for(i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}