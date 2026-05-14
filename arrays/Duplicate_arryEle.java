public class Duplicate_arryEle {
    public static void main(String[] args) {
        
        int A[]=new int[] {78,5,9,8,7,9,7,5,45,45,33,100,33};

        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){

                if(A[i]==A[j]){
                    System.out.println(A[i]);
                }
            }
        }
    }

}
