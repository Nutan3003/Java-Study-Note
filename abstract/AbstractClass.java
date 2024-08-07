
abstract class Shape{
abstract public  double perimeter();
abstract public double area();

}
class Circle extends Shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }



}
class Rectangle extends Shape {
    double length;
    double breath;

    public double perimeter(){
        return 2*Math.PI*(length+breath);


    }
    public double area(){
        return length*breath;
        
    }

}
public class AbstractClass{
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.length=20;
        r.breath=5;

        Shape s=r;
        System.out.println(s.area());
        
    }
}