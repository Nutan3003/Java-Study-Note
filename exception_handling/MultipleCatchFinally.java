
public class MultipleCatchFinally {
    public static void main(String[] args) {
        try{
            int Arr[]={10,0,8,3,5};
            try{
                int result=Arr[0]/Arr[1];
                System.out.println(result);
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(Arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("I am finally block");
           
        }
    }
}
