import java.util.*;
public class sumOfNaturalNum {
    
    public static int  sum(int n){
        if(n==1){
            return 1;
        }
        int sum1+=sum(n-1);
        System.out.println(sum1+ "");
        return sum
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number n:");
        int n=sc.nextInt();
        System.out.println("sum of natural number is:");
        
        System.out.println(sum1(n));
    }
        
}
