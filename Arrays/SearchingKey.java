import java.util.Scanner;
import java.util.*;
public class SearchingKey {
    
    public static void main(String[] args) {
        int arr[]={2,7,54,67,34,11,34,21};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter key:");
        int key=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Key if found at index:"+i);

            }
        }
        System.out.println("Key not found");
    }
}
