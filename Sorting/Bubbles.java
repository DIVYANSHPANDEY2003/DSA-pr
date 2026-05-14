
public class Bubbles {
    
    public static void bubbleSort(int A[]){

        // boolean swaps=true;
        for(int i=0;i<A.length-1;i++){
            // swaps=true;
            for(int j=0;j<A.length-1-i;j++){
                if (A[j]>A[j+1]) {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    
                    // swaps=true;
                }
                // if (swaps==false) 
                //     break;    
                
            }
        }

    }
    public static void printArray(int A[]){
        for (int i=0;i<A.length;i++) {
            System.out.print(A[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter elements of array:");
        // int A[]=new int [10];
        // A[10]=sc.nextInt();
        int A[]={9,5,47,8,3,61,4,51,111,6};
        bubbleSort(A);
        printArray(A);
        
    }
}
