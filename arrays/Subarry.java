import java.util.*;

public class Subarry {
    public static void subArry(int A[]){
        int ts=0;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(A[k]+ " ");
                    
                }
                 ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array is :"+ts);
    }
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        subArry(A);
    }
}
