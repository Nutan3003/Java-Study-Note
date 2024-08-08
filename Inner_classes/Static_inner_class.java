class Outer{
    static int x=10;
    int y=20;

    static class Inner{
        void display(){
            System.out.println(x);
        
        }
    }
}
public class Static_inner_class {
    public static void main(String[] args) {
        Outer .Inner io = new Outer.Inner();
        io.display();
        
    }
    
}
