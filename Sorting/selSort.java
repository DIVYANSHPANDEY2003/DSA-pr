public class selSort {
    

    public static void printArray(int A[]){

            for (int i=0;i<A.length;i++) {
                System.out.print(A[i]+ " ");
            }
            System.out.println();
        
    }

    public static void selectionSort(int A[]){
        for(int i=0;i<A.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<A.length;j++){
                if(A[j]< A[minPos]){
                    minPos=j;
                }
            }
            //swapping
            int temp=A[minPos];
            A[minPos]=A[i];
            A[i]=temp;

        }

    }

    public static void main(String[] args) {
        int A[]={5,7,9,10,6,99};
        selectionSort(A);
        printArray(A);
    }
}
