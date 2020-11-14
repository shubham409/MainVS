public class StirngRegex {
    public static void main(String[] args) {
        String s1 ="abc";
        System.out.println(s1.matches("."));// false

         // note matches is currently checking only for one alphabet 
        String s ="a";
        System.out.println(s.matches(".")); //true
        System.out.println(s.matches("[abc]"));//true

        s="abc";
        System.out.println(s.matches("[abc]"));//false

        s
        
    }
    // here are the following regex method taht we use
    // patterns
    // .
    // [abc]
    // [abc][yz]
    // [^abc]
    // [a-z0-9]
    // a|b
    // xz

    // metacharecters
    // \\w alphabets or digits
    // \\W neither alphabets nor digits
    // \\s space
    // \\S not a space
    // \\d digit
    // \\D not a digit

    // quatifiers(specify quatity of alphabte or a pattern)
    // * 0 or more
    // + 1 or more
    // ? 0 or 1
    // {x} x times
    // {x,y} between x and y times
}
