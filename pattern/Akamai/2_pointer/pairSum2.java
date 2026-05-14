
public class pairSum2 {
    public static int PairSumWithTarget(int arr[], int target){
        int left=0, right=arr.length-1;
        
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return ;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={2,8,4,56,9,7};
       int  target=65;
    }
}
