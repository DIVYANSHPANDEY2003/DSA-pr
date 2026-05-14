import java.util.*;

public class increNum {

    public static void printIncNum(int n){
        if(n==1){
            System.out.println(n);

            return;
        }
        printIncNum(n-1);
        System.out.println(n+ "");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you number n:");
        int n=sc.nextInt();
        System.out.println("your count is :");
        printIncNum(n);
    }
}
