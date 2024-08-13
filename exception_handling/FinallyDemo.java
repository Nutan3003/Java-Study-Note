public class FinallyDemo {
    static void meth1()throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("Final Messgaee");
        }
    }
    public static void main(String[] args) throws Exception{
        meth1();
      


        //     System.out.println(10/0);
        // }catch(Exception e){
        //     System.out.println(e);
        // }finally{
        //     System.out.println("Final message");
        
     
        
        
    }
    
}
