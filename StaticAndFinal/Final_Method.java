class Super{
    final void meth1(){
        System.out.println("Meth1");
    }

}
class Sub extends Super{
    //Final method we can not overrided
    // void meth1(){

    // }
    void meth2(){
        System.out.println("meth2");

    }
}
public class Final_Method {
    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.meth2();
        
    }
}
