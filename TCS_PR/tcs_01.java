
import java.util.*;
public class tcs_01 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter symbol");
        String s=sc.nextLine();
        int countStar=0,countHash=0;
        for(char ch:s.toCharArray()){
            if(ch=='*') countStar++;
            else if(ch=='#') countHash++;
        }
        System.out.println(countStar-countHash);
        sc.close();
    }
}
