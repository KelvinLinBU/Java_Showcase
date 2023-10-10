/*
 * Palindrome.java
 *
 * Computer Science 112
 *
 * Modifications and additions by:
 *     name:
 *     username:
 */
   
public class Palindrome {
    public static boolean isPal(String s) {
        // This line is included to allow the code to compile.
        // Replace it with your implementation of the method.
        if(s == ""){
            return true;
        }
        ArrayQueue list = new ArrayQueue(s.length());
        ArrayStack list2 = new ArrayStack(s.length());
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(Character.toLowerCase(s.charAt(i)))){
            list.insert(Character.toLowerCase(s.charAt(i)));
            list2.push(Character.toLowerCase(s.charAt(i)));
        }
            
        
    }
    for(int i = 0; i < s.length(); i++){
            if(list.remove() != list2.pop()){
                return false;}
            }
        return true;}
    
    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * Add five more unit tests that test a variety of different
         * cases. Follow the same format that we have used above.
         */
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(1) Testing on \"empty string\"");
        try {
            boolean results = isPal("");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();   
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(2) Testing on \"case\"");
        try {
            boolean results = isPal("case");
            boolean expected = false;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();   
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(3) Testing on \"a!!!!!a\"");
        try {
            boolean results = isPal("a!!!!!a");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(4) Testing on \"!!!!!!!!\"");
        try {
            boolean results = isPal("!!!!!!!!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(5) Testing on \"!roor!\"");
        try {
            boolean results = isPal("!roor!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();
    }
    }
    
