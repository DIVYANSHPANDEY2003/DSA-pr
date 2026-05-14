public class longestConsectiveSequence {
    public static int longestConsecutiveBrute(int nums[]){
        int n=nums.length;
        int longest=0;
        
        for(int i=0;i<n;i++){
            int current=nums[i];
            int cnt=1;
            while(linearSearch(nums, current+1)){
                current++;
                cnt++;
            }
            longest=Math.max(longest, cnt);
        }
        return longest;
        
    }
          static boolean linearSearch(int nums[],int target){
        for(int num:nums){
            if(num==target)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={101,102,99,105,106,107,108,11,12,10,8};
        System.out.println("longest concesutve sequence is:"+ longestConsecutiveBrute(nums));
    }

}
