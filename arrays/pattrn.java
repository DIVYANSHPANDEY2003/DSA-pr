import java.util.*;

public class pattrn {
    public static  void PatternQues(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){

                System.out.println(" ");
            }
            for(int j=0;j<2*i+1;j++){
            System.out.println("*");}
            for(int j=0;j<n-i-1;j++){
                System.out.println(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<t;i++){
            PatternQues(n);
            
        }
       
    

    }
}
