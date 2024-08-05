class Parent{
    public Parent(){
        System.out.println("Parent Const");

    }
}

class child extends Parent{
    public child(){
        System.out.println("Child const");
    }
}

class GrandChild extends child{
    public GrandChild(){
        System.out.println("Grantchild");
    }
}
public class InheritClass {
    public static void main(String[] args) {
        GrandChild gh=new GrandChild();
        
    }
    
}
