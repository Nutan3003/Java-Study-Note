public class SecondMax {
    public static void main(String[] args) {
        int []a={10,2,5,7,3,45,87,98,34,23};
        int max1,max2;
        max1=max2=a[0];

        for(int i=0;i<=a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];

            }
        }
        System.out.println(max2);

    }
    
}
