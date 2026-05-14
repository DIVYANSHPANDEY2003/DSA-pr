public class Sum_SubArrays {
    
    public static void maxSubarraySum(int nums[]){
        // 1=>***********BRUTE FORCE APPROACH**********
        // int currSum=0;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int start=i;
        //     for(int j=i;j<nums.length;j++){
        //         int end=j;
        //         currSum=0;
        //         for(int k=start;k<=end;k++){
        //             currSum+=nums[k];
        //         }
        //         System.out.println(currSum);
        //         if(max<currSum){
        //             max=currSum;
        //         }
        //     }
        // }
        // System.out.println("max sum is:=" +max);



        // 2.->******PREFIX ARRAYS********

        // int currSum=0;
        // int max=Integer.MIN_VALUE;
        // int prefixArr[]=new int[nums.length];
        //     prefixArr[0]=nums[0];

        // for(int i=1;i<prefixArr.length;i++){
        //     prefixArr[i]=prefixArr[i-1]+nums[i];
        // }

        // for(int i=0;i<nums.length;i++){
        //     int start=i;
        //     for(int j=i;j<nums.length;j++){
        //         int end=j;
        //         currSum=start==0 ? prefixArr[end]:prefixArr[end]-prefixArr[start-1];
        //         if(max<currSum){
        //             max=currSum;
        //         }
        //     }
        // }
        // System.out.println("max sum=" +max);


        // 3.->******KADANE'S SUBARRAYS********

    }
    public static void main(String[] args) {
        int nums[]={10,20,63,85};
        maxSubarraySum(nums);
    }
}
