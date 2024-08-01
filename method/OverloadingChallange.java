public class OverloadingChallange {
    
    //Overloaded method to calculate area;
    static double area(double length,double breath){
        System.out.println("Area of rectangle");
        return length*breath;
    }

    static double area(int radius){
        System.out.println("Area of circle:");
        return Math.PI *radius*radius;
    }
    static double trapsium(double s1,double s2,double height){
        return 1/2*(s1+s2)*height;
    }

    //overloaded method to reverse a int or array;
    static int reverse(int a){
        int rev=0;
        while (a>0) {
            rev = rev * 10 + a % 10;
            a=a/10;    
        }
        return rev;

    }

    static void reverse(int a[]){
        int front=0;
        int rare=a.length-1;
        while(front<rare){
            int temp=a[rare];
            a[rare]=a[front];
            a[front]=temp;

            front++;
            rare--;
        }
        
    }
    //overloaded method to validate name and age;
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\S]*");

    }
    static boolean validateI(int age){
        return age>=3 && age <=15;

    }
    public static void main(String[] args) {
        ////Overloaded method to calculate area;

        double length,breath,height,radius;
        System.out.println(area(2));



         //overloaded method to reverse a int or array;
        //int a[]={10,20,30,40,50};
        int a;
        System.out.println(reverse(12345));
        // System.out.println("\nThe Array After Reverse is: ");
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        //     System.out.print(a[i]+" ");
        // }


        ////overloaded method to validate name and age;
       System.out.println(validate("Nutan"));
        
    }
    
}
