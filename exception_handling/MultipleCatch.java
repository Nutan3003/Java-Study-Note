public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a[]={10,2,45,67,34,0};
            int res;
            res=a[0]/a[5];
            System.out.println("Result:"+res);
            System.out.println(a[10]);
            
        }
        catch(ArithmeticException e){
            System.out.println(e +"is occur");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e+"is occur");
        }
    }
    
}
