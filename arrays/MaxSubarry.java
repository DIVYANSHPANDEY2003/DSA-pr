public class MaxSubarry {
    
    
        public static void maxSubArraySum(int A[]){
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;

            for(int i=0;i<A.length;i++){
                for(int j=i;j<A.length;j++){

                    currSum=0;

                    for(int k=i;k<=j;k++){
                        currSum+=A[k];
                        
                    }
                    
                    System.out.println(currSum);
                    if(maxSum<currSum){
                        maxSum=currSum;
                    }
                }
                
            }
            System.out.println("max sum  is :"+maxSum);
        }
        public static void main(String[] args) {
            int A[]={2,4,6,8,10};
            maxSubArraySum(A);
        }
    }



