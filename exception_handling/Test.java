public class Test{
    public static void main(String[] args) {
        int a,b,c;
       try{
        a=5;
        b=10;
        c=a/b;
        System.out.println(c);
       }
     
        catch(ArithmeticException e){
            System.out.println("Division by zero error");

        }
    }
}