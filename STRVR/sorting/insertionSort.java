public class insertionSort {
    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+ "");
        }
        System.out.println();
    }
    public static void insertion_Sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int j=i;
            while(j>0&& nums[j-1]>nums[j]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={45,7,0,25,4,6,5,55,5,4,57};
        insertion_Sort(nums);
        printArray(nums);
    }
}
