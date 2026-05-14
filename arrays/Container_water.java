public class Container_water{

    public static int ContainerWithMostWater(int height[]){
        int max=0;
        int lft=0;
        int rgt=height.length-1;
        while(lft<rgt){
            int ht=Math.min(height[lft], height[rgt]);
            int wdt=rgt-lft;
            int curr=ht*wdt;
            max= Math.max(max, curr);

            if(height[lft]<height[rgt]){
                lft++;
            }
            else{
                rgt--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int res=ContainerWithMostWater(height);
        System.out.println(res);
    }

}