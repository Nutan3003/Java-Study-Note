import java.util.*;
public class ObjectRetuenType {
    //String is an object so we can also  pass the return typa as object.
    //A	method	can	have	its	object	as	the	return	type
  static String userName(String email){
        int a=email.indexOf('@');
        String name=email.substring(0, a);
        return name;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email:");
        String email=sc.nextLine();
      System.out.println(  userName(email));

        
    }
}
