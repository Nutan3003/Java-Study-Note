abstract class Super{
    public Super(){
        System.out.println("Super constructor");

    }
    public void meth1(){
        System.out.println("Meth1 of super");
    }

    abstract public void meth2();
}
class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Math2 of sub");
    }
}
public class AbstractExample{
    public static void main(String[] args) {
       Sub s = new Sub();
        s.meth1();
        s.meth2();
        
    }

}