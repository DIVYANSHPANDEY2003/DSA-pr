public class rotatedSortedArray {
    public int  searchSorted_1(int nums[],int target){
       int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
             return mid; 
             
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<= nums[high]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[low]<=target && target<= nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    
}
