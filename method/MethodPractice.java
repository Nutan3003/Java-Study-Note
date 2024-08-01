public class MethodPractice {
    //NOTE:The valsue of actual parameter will not change when the formal parameter will change.

    static void inc(int x){
        x++;
        System.out.println(x);
    }
    //We can call metehod in two ways
    //1. making mathodas static
    //2.By using the creating the object and calling the mathod
   int max(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        MethodPractice mp=new MethodPractice();
        int a=10,b=20,c;
        System.out.println(mp.max(a,b));
        inc(a);
        System.out.println(a);
       
    }
    
}
//NOTE:The value of actual parameter will not change when the formal parameter will change.
