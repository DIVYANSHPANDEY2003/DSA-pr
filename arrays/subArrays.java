public class subArrays {
    public static void printSubarrays(int nums[]){
        int ts=0;
        int n=nums.length;
      for(int i=0;i<n;i++){
       int start=i;
        for(int j=i;j<n;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(nums[k]+" ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
      }
      System.out.println("total subarrays:="+ts);
    }
    public static void main(String[] args) {
        int nums[]={2,4,5,8,7,10,12};
        printSubarrays(nums); 
    }
}
