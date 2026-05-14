
public class selection_sort{
   
    public static void printArray(int nums[]){
        for(int i=0;i<= nums.length;i++){
            System.out.println(nums[i]+ "");
        }
        System.out.println();
    }
    public static  void selSort(int nums[]){
        for(int i=0;i<= nums.length-1;i++){
           int minPos=i;
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]<nums[minPos]){
                    minPos=j;
                }
            }
            int temp=nums[minPos];
            nums[minPos]=nums[i];
            nums[i]=temp;

        }

    }
    public static void main(String[] args) {
        int nums[]={45,7,1,0,3,65,99,78};
        
        selSort(nums);
        printArray(nums);
        
    }
}