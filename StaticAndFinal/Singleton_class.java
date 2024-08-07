class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine our = null;
//If the constructor is private we can not create the object of class
    private CoffeeMachine(){
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        milkQty=1;

    }
    public void fillWater (float qty){
        waterQty = qty;
    }
    public void fillSuger(float qty){
        sugarQty=qty;
    }
    public float getCoffee(){
        return 0.23f;
         
    }
    static public CoffeeMachine getMachine(){
        if(our==null){
            our=new CoffeeMachine();
        }
        return our;

    }




}
public class Singleton_class {
    public static void main(String[] args) {
        //return the reference of coffee machine
        CoffeeMachine cf= CoffeeMachine.getMachine();
    }
    
}
