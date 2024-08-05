class Super{
    public void meth1(){
        System.out.println("Super meth1");
    }
    public void meth2(){
        System.out.println("Super meth2");
    }

}
class Sub extends Super{
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meth3(){
        System.out.println("sub meth3");
    }

}
public class RuntimePoly {
    public static void main(String[] args) {
        Super sp = new Sub();
        sp.meth1();
        sp.meth2();
        //sp.meth3();
        
    }
    
}
