interface Test{
    void meth1();
    void meth2();
}
class MyTest implements Test{
    public void meth1(){
        System.out.println("Meth1 is my class");
    }

    public void meth2(){
        System.out.println("Meth2 in my class");

    }

}
public class InterfacePractice{
    public static void main(String[] args) {
        Test t=new MyTest();
        t.meth1();
        t.meth2();

        
    }
}