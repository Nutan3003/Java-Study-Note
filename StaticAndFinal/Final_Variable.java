class Test{
    //Final variable initilized normally
    final int X=10;

    //Final variable can be static then only we can use it in static block
    static final double MIN;

    final int MAX;

    static{
        //here we use static variable in staic block
        MIN =100;
        System.out.println(MIN);
    }
// final variable can be a constructor.
    Test(){
        MAX=20;
        System.out.println(MAX);
    }
}
public class Final_Variable {
    public static void main(String[] args) {
Test t = new Test();
    }
}
