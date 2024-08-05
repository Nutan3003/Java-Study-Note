 class Super{
    public void display(){
        System.out.println("Super class");
    }
 }

 class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub class");
    }
 }
 
 public class overriding{

    public static void main(String[] args) {
        Super sp = new Super();
        sp.display();
        Sub sb = new Sub();
        sb.display();
        
    }
 }