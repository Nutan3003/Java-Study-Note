public class TwoDia {
    public static void main(String[] args) {
        //ways to creating a array
        int [][]arr=new int[5][5];
        // int b[][];
        // b=new int[8][2];
        // int[]c[]=new int [3][3];


        //E is a 2D array and F is a 1D array
        int[] E[],F;
        E=new int[5][5];
        F=new int[5];
        
        //G H and I are 1D arrays
        int[] G,H,I;

         //Jagged Array
         int X[][];
         X=new int[3][];
         
         X[0]=new int[5];
         X[1]=new int[3];
         X[2]=new int[8];

         int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

         //Displaying array
         for(int x[]:M){
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
         }
        

    }
    
}
