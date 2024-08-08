class Outer{
    public void Display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Hello I am Nutan");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();

        //Also create anonomous object
        //new Inner().innerDisplay();
    }
}
public class Local_inner_class {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Display();

        
    }
    
}
