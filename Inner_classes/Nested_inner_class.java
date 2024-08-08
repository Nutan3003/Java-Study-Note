class Outer{

    int x=10;
    //This inner class is aailabe for intire outer class
    Inner i = new Inner();
//The class inside class is known nested class
    class Inner{
       int y=20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void OuterDisplay(){
        //Inner i= new Inner();
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class Nested_inner_class{
    public static void main(String[] args) {
        Outer o= new Outer();
        o.OuterDisplay();
        //Out side the class we can also access the inner class
        Outer.Inner oi = new Outer().new Inner();

        
    }
}