public class binary_search {

    // public static int binarySearch(int A[],int key){
    
//   ********* ITERATIVE METHOD****

        // int start=0,end=A.length-1;
        // while (start<=end) {
        //    int mid=(start+end)/2;

        // //    comparisons 
        // if(A[mid]==key){
        //      return mid;
        // }
        // if(A[mid]>key){  //left
        //     end=mid-1;
        // }
        // else{  //right
        //     start=mid+1;
        // }
            
        // }
        // return -1;

    // *********** RECURSIVE METHOD ***********
    
        public static int recursiveBinarySearch(int nums[],int low,int high,int target){
            if(low>high)
                return -1;
            int mid=(low+high)/2;
            if(nums[mid]==target)
            return mid;
            else if(target>nums[mid])
            return recursiveBinarySearch(nums, mid+1,high,target);
            return recursiveBinarySearch(nums, low, high-1, target);
        }
    }
    public static void main(String[] args) {
        int nums[]={2,4,8,10,12,14,16};
        int target=14;
        

        // System.out.println("index for key is :" +binarySearch(A, key));
    } 

