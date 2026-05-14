public class Pairs_ar {
   
    public static void pairsArry(int A[]){
        int tp=0;
        for(int i=0;i<A.length;i++){
            int current=A[i];
            
            for(int j=i+1;j<A.length;j++){
                System.out.print("("+current+","+A[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs=" +tp);

    }
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        pairsArry(A);
        

    }
}
