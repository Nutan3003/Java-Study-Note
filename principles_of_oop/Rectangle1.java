class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;

    }
    public double perimeter(){
        return 2*(length*breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }

}
public class Rectangle1 {

    public static void main(String[] args) {

        Rectangle r1= new Rectangle();
        r1.breadth=5.5;
        r1.length=10.5;
        
        System.out.println("Area"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter()
        );
        System.out.println("It is a square:"+r1.isSquare());
        
    }
}