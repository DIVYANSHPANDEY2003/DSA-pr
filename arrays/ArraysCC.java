public class ArraysCC {
    public static int getLargest(int num[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,5,4,8,79,5,63};
        System.out.println("largest value is :"+ getLargest(num));
    }
}
