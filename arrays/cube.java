public class cube {

    public static void cubeEven(int x , int ans){

    if (count<10) {
    
            if(x%2==0) { 

                System.out.println(x*x*x);
                ans++;
                 
            } 
            x++;
          cubeEven(x, ans);  

        }  
        
    }

    public static void main(String[] arg) {

        cubeEven(8);
    }

}
