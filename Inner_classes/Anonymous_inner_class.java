//Interfaces can have an abstract method()
// interface  My{
//      void display();
// }
abstract class My{
    abstract public void display();
}

class Outer{
    public void meth(){
        My m = new My(){public void display(){System.out.println("HELLO");}};
        m.display();
    }
}
public class Anonymous_inner_class {
    public static void main(String[] args) {
        Outer o =new Outer();
        o.meth();
        
    }
}
