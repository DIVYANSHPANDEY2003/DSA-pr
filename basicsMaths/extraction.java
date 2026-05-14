public class extraction {
    public static void main(String[] args) {
        int N=9658745;
        int last_digit;
        int counter=0;

        while(N>0){
            last_digit=N%10;
            counter++;
            N=N/10;
        }
        System.out.println();
    }
    
}
