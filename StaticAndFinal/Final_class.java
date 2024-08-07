final class name{
    String name;
    name(String name){
        this.name=name;
    }

    String print(){
        return name;
    }
}
// final class we can not extends
// class call extends name{

// }
public class Final_class {
    public static void main(String[] args) {
        //we can only create the object of final class and use it
        name n1=new name("Nutan");
        
    }
    
}
