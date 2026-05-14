
public class reverse_of_arry {

    public static int reverseArry(int A[]){
        int start=0,end=A.length-1;
        while (start<end) {
            int temp=A[end];
            A[start]=temp;
            
            start++;
            end--;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};

        reverseArry(A);
        for (int i =0;i<=A.length;i++) {
            System.out.print(A[i]);
            
        }
        System.out.println();
    }

}
