


public class removeDuplicateInSortedArray {
    public static int Remove_duplicte_(int nums[]){
        if(nums.length==0)
        return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){

                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,4,4,5,5,5,8,8,8};
        
        System.out.println(Remove_duplicte_(nums));
    }
}
