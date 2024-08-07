class Car{
    static long price = 10;
     
    static double OnRoadPrice(String city){
        switch (city) {
            case "Pune":
            return price+price*0.1;
             
            case "Mumbai":
            return price+price*0.09;
              
           
        }
        return 0;

    }

}

public class StaticMember{
    public static void main(String[] args) {
        Car c = new Car();
        Car c1=new Car();
        System.out.println(c1.OnRoadPrice("Pune"));
        c.price=20;
    System.out.println(c1.price);
    System.out.println(Car.OnRoadPrice("Mumbai"));
        
    }
}