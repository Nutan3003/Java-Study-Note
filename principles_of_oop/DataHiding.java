class Rectangle{
    private int length;
    private int breath;

    public int getlength(){
        return length;
    }

    public void setlength(int l){
       if(l>0)
         length=l;
       else
        length=0;

    }

    public int getbreath(){
        return breath;
    }

    public void setbreath(int b){
        if(b>=0)
        breath=b;
      else
       breath=0;
    }

    public int area(){
        return length*breath;
    }

    public int perimeter(){
        return 2*length*breath;
    }

}
public class DataHiding {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.setlength(10);
        r1.setbreath(20);

        System.out.println("Area:"+ r1.area());
        System.out.println("Perimeter:"+r1.perimeter());

        
    }
    
}
