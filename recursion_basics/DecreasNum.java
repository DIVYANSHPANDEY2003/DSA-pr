import java.util.*;
// package recursion_basics;

public class DecreasNum {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n + "");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number n :");
         int n = sc.nextInt();
        printDec(n);
    }



}
