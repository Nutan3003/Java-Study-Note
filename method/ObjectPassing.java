public class ObjectPassing {
    //Array name may be different but it refering the same array
    static void update(int x[],int index,int value){
       x[index]=value;
    }
    static void change(int x,int value){
        x=value;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int A[]={10,20,30,40};
    
        update(A,0,25);

    for(int i=0;i<A.length;i++){
        System.out.print(A[i]+" ");
    }
    //Primative data type value are not change in formal parameter
    int x=20;
    change(x, 40);
    System.out.println("Value of primative :"+x);

        

        
    }
}
