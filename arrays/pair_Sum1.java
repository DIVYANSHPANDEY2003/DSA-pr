import java.util.*;

public class pair_Sum1 {
    public static boolean PairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp!=rp){
            // case1
            if(list.get(lp)+list.get(rp)==target){
            
                return true;
            }
            // case2
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter n - ");
        n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int e;
            e=sc.nextInt();
            list.add(e);
        }
        System.out.println(PairSum(list,0));
    }
}
