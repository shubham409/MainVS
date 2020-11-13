public class StringPool {
    public static void main(String[] args) {
        // without new it will store value in the pool and check next time whether it is inthe the pool if it is in the pool then it will not create another object
        String str1="hello";
        String str2="hello";
        // with new it will store new vlaue each time in the heap and maintain the copy of it in the pool also and if there is copy in the pool already then it  will not create it in the pool but in heap evry time it is created no matter it is in the pool or not 
        String str3=new String ("hello");
        String str4=new String ("hello");
        String str5="shubham";        
        
        char[] chr={'a','b','c'};
        String str6 = new String (chr);
        // Note that == check in memory of two object that whether they occupy same place in memory or not 
        // Note that .eqauals to checks the content of two object like what vlaue they hold  
        System.out.println(str1==str2);
        System.out.println(str3==str4);
        System.out.println(str1==str3);


    }
}
// == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.

// If a class does not override the equals method, then by default it uses equals(Object o) method of the closest parent class that has overridden this method. See this for detail