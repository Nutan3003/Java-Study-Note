public class CalculateDisscount {
    //Maximum of number using variable argument
    static int max(int ...a){
        if(a.length==0)
        return Integer.MIN_VALUE;
        int m=a[0];
        return m;

        //For more element
        
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<a.length;i++)
    //     {
    //      if(largest <a[i])
    //      {
    //      largest =a[i];
    //     }
    //  }
    //  return largest;
   
        
     }
    
    //Sum of all element using variable argument
    static int sum(int ...x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum=sum+x[i];
        }
        return sum;
    }
    //Calculate discount using variable argument
    static double discount(double ...P){
        double sum=0;
        
        for(int i=0;i<P.length;i++)
            sum+=P[i];
        
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;
    }
    public static void main(String[] args) {
        
        System.out.println(max(10,20,100));
        System.out.println(max(10));
        System.out.println(discount(10,20));

        System.out.println(sum(10,20));
        
    }
    
}
