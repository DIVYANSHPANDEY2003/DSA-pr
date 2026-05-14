import java.util.*;
public class factorial {
    
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fN=n*fact(n-1);
        return fN;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number n:");
        int n=sc.nextInt();
        System.out.println("factorial is :");
         System.out.println(fact(n));

    }
}
