

public class bubble_sort {

    public static void printArrays(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            System.out.println(nums[i]+ "");
        }
        System.out.println();
    }
     public static void bubbleSort(int nums[]){
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
            if(nums[j]>nums[j+1]){

                int temp=nums[j+1];
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }
    }

     }
     public static void main(String[] args) {
         int nums[]={45,78,96,2,1,3,45};
         bubbleSort(nums);
         printArrays(nums);

     }
}
