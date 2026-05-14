

public class Pairs {
    public static void pairsOfAarry(int nums[]){
       int tp=0;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+ curr + ","+nums[j]+")");
                tp++;
            }
            System.out.println();
            
        }
        System.out.println("total pairs is:"+tp);
        

    }
    public static void main(String[] args) {
        int nums[]={2,4,6,4,10};
        pairsOfAarry(nums);
    }
}
