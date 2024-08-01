//Variable argument :
public class VariableArgument {
    // static void show(int...x){
    //    for(int a:x){
    //     System.out.println(a);
    //    }
    // }
    static void showList(int start ,String ...s){
        for(int i=0;i<s.length;i++){
            System.out.println(start+". "+s[i]);
            start++;
        }

    }
    public static void main(String[] args) {
        // show();
        // show(10,20,30);
    //     //When we declare with new keyword it will store in heap memory.
      // show(new int[]{10,20,30,40,50,60});
    showList(3,"Nutan","Roshan","Omkar","siddhant","Ganesh","Aniket");


        
    }
    
}

