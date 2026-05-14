public class missingNumber {
    public static int missingNumberArray(int nums[],int n){
        // *******BRUTE FORCE*************
        // int flag;
        // for(int i=1;i<n;i++){
        //     flag=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==i){
        //             flag=1;
        //             break;
        //         }
                
        //     }
        //     if(flag==0){
        //     return i; 
        //     } 
        // }
        // return -1;

        // *****optimal SOLUTION*************
        // int xorAll = 0;
        // int xorArr = 0;

        // // XOR from 1..n
        // for (int i = 1; i <= n; i++) {
        //     xorAll ^= i;
        // }

        // // XOR of array elements
        // for (int num : nums) {
        //     xorArr ^= num;
        // }

        // // Missing number = xorAll ^ xorArr
        // return xorAll ^ xorArr;
        


        int xor = n;  // start with n, because loop will cover 0..n-1

        for (int i = 0; i < n - 1; i++) {
            xor ^= i + 1;   // XOR with numbers from 1..n-1
            xor ^= nums[i]; // XOR with array elements
        }

        return xor;

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,5,6};
        int n=6;
        System.out.println("missing number:" +missingNumberArray(nums, n));
    }
}
