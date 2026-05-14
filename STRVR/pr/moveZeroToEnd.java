import java.util.Arrays;

public class moveZeroToEnd {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,12,1,21,2,1,2,12};
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
