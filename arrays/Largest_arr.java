public class Largest_arr {

    public static int kthsmallest(Integer []arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        // int max=0;
        Integer arr[]= new Integer[] {45,5,88,4,6,99,8,73};
        int k=5;
        System.out.println(kthsmallest(arr, k));
        // for(int i=0;i<=arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
    
        //     }
           
        // }
        // System.out.println(max);

        // int largest=Integer.MIN_VALUE;
        // int  smallest=Integer.MAX_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     if(largest<arr[i]){
        //         largest=arr[i];
        //     }
        //     if(smallest>arr[i]){
        //         smallest=arr[i];
        //     }

        // }
        // System.out.println(largest);
        // System.out.println(smallest);
    
    }
    
}
