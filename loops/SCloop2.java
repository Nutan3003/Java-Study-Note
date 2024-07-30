import java.util.*;
public class SCloop2 {

    //Display Digits of number
    
    // public static void main(String[] args)
    // {
    //    Scanner scan=new Scanner(System.in);

    //    System.out.println("Enter a Number");
    //    int n=scan.nextInt();

    //    int r;
    //    while(n>0)
    //    {
    //     r=n%10;
    //     n=n/10;

    //     System.out.println(r);
    
    //    }
    //    System.out.println(n);
        
    // }


     /* Count Digits Of a Number
    
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();

       int count=0;
       while(n>0)
       {
        n=n/10;
        count++;
       }
        System.out.println(count);
    }
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int r;
        int m=n;
        while(n>0){
            r=n%10;
            n=n/10;

            sum=sum+r*r*r;
        }
        if(sum==m)
        System.out.println("Its a Armstrong Number");
    else
        System.out.println("Its not an Armsttrong Number");
        
    }
}