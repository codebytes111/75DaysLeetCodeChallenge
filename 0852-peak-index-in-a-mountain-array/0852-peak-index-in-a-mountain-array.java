class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int n = arr.length;
      if(n==1) return 0;
      if(arr[0]>arr[1]) return arr[1];
      if(arr[n-1]>arr[n-2]) return arr[n-1];
      int low = 1;
      int high = n-1;
      while(low<=high){
        int mid = low + (high - low)/2;
        if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
            return mid;
        }
        if(arr[mid-1] < arr[mid] ) {
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
      }
      return -1;
    }
}