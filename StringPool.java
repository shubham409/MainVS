public class StringPool {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=new String ("hello");
        String str4=new String ("hello");
        String str5="shubham";        
        
        char[] chr={'a','b','c'};
        String str6 = new String (chr);

        System.out.println(str1==str2);
        System.out.println(str3==str4);
        System.out.println(str1==str3);


    }
}
// == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.

// If a class does not override the equals method, then by default it uses equals(Object o) method of the closest parent class that has overridden this method. See this for detail