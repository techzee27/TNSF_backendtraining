// Datatypes: A datatype tells the kind of data the variables hold.
/* there are two types of datatypes:-
 *  Primitive datatype and Non Primitive datatype
 * 
 * 
 * Primitive Datatypes : These are the fundamental, built-in data types in Java, representing single, simple values.
 * 
 * Non-Primitive (Reference) Data Types : These data types are not predefined by the language and are used to store references to objects.
*/

public class Primitive_datatypes {
    // 1. byte: 8-bit signed integer
        // Range: -128 to 127
        byte a = 10;

    // 2. short: 16-bit signed integer
    // Range: -32,768 to 32,767
    short b = 2000;

    // 3. int: 32-bit signed integer
    // Range: -2,147,483,648 to 2,147,483,647
    int c = 50000;


    // 4. long: 64-bit signed integer
    // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long d = 10000000000L; // L suffix indicates a long literal


    // 5. float: 32-bit single-precision floating-point number
    // Used for decimal values with less precision
    float e = 5.75f; // f suffix indicates a float literal


    // 6. double: 64-bit double-precision floating-point number
    // Used for decimal values with high precision
    double f = 19.99;


    // 7. char: 16-bit Unicode character
    // Range: '\u0000' (0) to '\uffff' (65,535)
    char g = 'A';
    

    // 8. boolean: 1-bit (true or false)
    // Represents one bit of information (true/false)
    boolean h = true;
    boolean i = false;

    public void print()
    {
        System.out.println("=== Primitive Data Types in Java ===\n");

        System.out.println("1. byte (8-bit signed integer): " + a);
        System.out.println("2. short (16-bit signed integer): " + b);
        System.out.println("3. int (32-bit signed integer): " + c);
        System.out.println("4. long (64-bit signed integer): " + d);
        System.out.println("5. float (32-bit floating-point): " + e);
        System.out.println("6. double (64-bit floating-point): " + f);
        System.out.println("7. char (16-bit Unicode character): " + g);
        System.out.println("8. boolean (true/false): " + h + " " + i);
    }
        
    
}
