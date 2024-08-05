class Parent{
    public Parent(){
        System.out.println("Non parameterized const2");
    }
    public Parent(int x){
        System.out.println(x+"me");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Non parameterized const1");

    }

    public Child(int y){
        System.out.println(y);
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}
public class ParamConst {
    public static void main(String[] args) {

        Child ch = new Child(10);
         //Child c=new Child();
        //Child c=new Child(20);
        Child c=new Child(10,20);
        
    }
    
}
