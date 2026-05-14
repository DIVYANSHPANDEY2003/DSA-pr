public class Binary_Search {
    public static int binary(int nums[],int key){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==key){
                return mid;
            }
                 if(nums[mid]<start){
                    start=mid+1;
                    return start;
                }
                else{
                   return mid-1;
                }
            
            
        }
        return -1;
    }
    public static void main(String[] args) {

       int nums[]={45,78,46,444,444,14,5};
       int key=444;
       System.out.println("searched number is at index:" + binary(nums, key));

    }
}
