class Car{
    public void Start(){
        System.out.println("Car started");

    }
    public void accelerate(){
        System.out.println("Car is Accelerated");

    } 
    public void changeGear(){
        System.out.println("Car Gear changed");

    }

}
class LuxaryCar extends Car{
  
    public void changeGear(){
        System.out.println("Automatic Gear");

    }
    public void OpenRoof(){
        System.out.println("Sun roof is opened");

    }

}
public class MethodOverriding2 {
    public static void main(String[] args) {
        Car c= new LuxaryCar();
        c.Start();
        c.accelerate();
        c.changeGear();
        //c.OpenRoof();    //open roof is not called beacause it only call the reference class mathod and overried method of the object class
        
        
    }
    
}
