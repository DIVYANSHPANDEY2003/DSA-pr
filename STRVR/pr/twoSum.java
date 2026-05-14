
import java.util.Arrays;



public class twoSum {
    // *********BRUTE FORCE******

    public static String bruteTwoSum(int nums[],int target){
        // for(int i=0;i<nums.length;i++){
        //     ;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return "yes";
        //         }
        //     }
        // }
        // return "no";

        // *******BETTTER SOLUTION*****

        // HashMap<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int Sum=target-nums[i];
        //     if(mp.containsKey(Sum)){
        //         return "yes";

        //     }
        //     mp.put(nums[i],i);
        // }
        // return "no";

        // ******OPTIMAL solutionn***********
        // two arrays approach---> only for sorted arrays

        Arrays.sort(nums);
        int lft=0,rgt=nums.length-1;
        while(lft<rgt){
            int sum=nums[lft]+nums[rgt];
            if(sum==target){
                return "yes";
            }
            else if(sum<target){
                lft++;
            }
        else{
            rgt--;
        }
        }
        return "no";

    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,11};
        int target=14;
        System.out.println("two sum is " +bruteTwoSum(nums, target));
    }
}
