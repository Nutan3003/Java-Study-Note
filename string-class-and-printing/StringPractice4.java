public class StringPractice4 {
    public static void main(String[] args) {
        
        String str1="f";
        System.out.println(str1.matches("."));
        
        // String str1="a";//b,c
        // System.out.println(str1.matches("[abc]"));
        
        // String str1="p";//true for alphabets other than abc
        // System.out.println(str1.matches("[^abc]")); //➢ [^abc]: the string is true if the symbol is other than a, b, & c. 
        
        // String str1="7";//A,a7
        // System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z][0-9]
        
        // String str1="f";
        // System.out.println(str1.matches("f|m"));   // it is true for single alphabets fro either A or b. 

        
        // String str1="b";
        // System.out.println(str1.matches("\\w"));  //\w: it will be true if it is either alphabet or digits. 

        
        // String str1="5";
        // System.out.println(str1.matches("\\d")); //it will be true if it is a digit among 0-9. 
        
        // String str1="$";
        // System.out.println(str1.matches("\\D")); //\D: it will be true if it is any symbol other than digits. 

    }
    
}
