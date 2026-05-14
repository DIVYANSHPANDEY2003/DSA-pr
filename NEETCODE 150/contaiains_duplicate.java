
import java.util.HashSet;

public class contaiains_duplicate {

    // ******OPTIMAL SOLUTION **********
    public boolean duplicate(int nums[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            if(hs.contains(num)){
                return true;

            }
            hs.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={4,8,5,6};
        
       contaiains_duplicate dup=new contaiains_duplicate();
       boolean res=dup.duplicate(nums);
       if(res){
        System.out.println("Arrays contains Duplicate elements");
       }
       else{
        System.out.println("array does not contains duplicates");
       }
    }
}
