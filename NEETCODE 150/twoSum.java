
import java.util.*;


public class twoSum {
    // *********BRUTE FORCE**********88
    // public static int[] twoSumEasy(int[] nums,int target){
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //         return new int[]{};
    // }
    //************ OPTIMAL SOLUTION*************

    public static int[]twoSumOptimal(int nums[],int target){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int comp=target-nums[i];
        if(mp.containsKey(comp)){
            return new int []{mp.get(comp),i};
        }
        mp.put(nums[i],i);
        }
        return  new int []{}; 
    } 
    public static void main(String[] args) {
        int [] nums={2,8,7,5};
        int target=7;
        int res[]=twoSumOptimal(nums, target);
        
        if(res.length>0){
            System.out.println("At index: " +res[0]+", "+ res[1]);
            System.out.println("Elements are: " +nums[res[0]]+", "+ nums[res[1]]);
        }
    }
    
}
