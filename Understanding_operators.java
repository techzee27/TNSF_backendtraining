
public class Understanding_operators {
    public static void main(String[] args) {

        // Declaring byte variables
        byte a = 7;
        byte b = 2;
        byte c = 5;

        System.out.println("The following two numbers a & b are : " + a + " and " + b);

        // ---------------------- 1. Arithmetic Operators ----------------------
        // These operators are used to perform mathematical operations.
        System.out.println("\n1. Arithmetic Operators Examples : ");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division (integer division)
        System.out.println("a % b = " + (a % b));  // Modulus (remainder after division)

        // ---------------------- 2. Assignment Operators ----------------------
        // These operators are used to assign and update variable values.
        System.out.println("\n2. Assignment Operators Examples : ");
        int x = 10;  // Initial value assigned using '='
        System.out.println("x = " + x);
        x += 5;  // Adds 5 to x (x = x + 5)
        System.out.println("x += 5 : " + x);
        x -= 3;  // Subtracts 3 from x (x = x - 3)
        System.out.println("x -= 3 : " + x);
        x *= 2;  // Multiplies x by 2 (x = x * 2)
        System.out.println("x *= 2 : " + x);
        x /= 4;  // Divides x by 4 (x = x / 4)
        System.out.println("x /= 4 : " + x);
        x %= 3;  // Stores the remainder when x is divided by 3 (x = x % 3)
        System.out.println("x %= 3 : " + x);

        // ---------------------- 3. Unary Operators ----------------------
        // Unary operators work on a single operand.
        // ++ is increment, -- is decrement, and ! is logical NOT (used for booleans).
        System.out.println("\n3. Unary Operators Examples : ");
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); // Pre-increment: first increases, then prints
        System.out.println("--a = " + (--a)); // Pre-decrement: first decreases, then prints
        System.out.println("a++ = " + (a++)); // Post-increment: prints first, then increases
        System.out.println("a-- = " + (a--)); // Post-decrement: prints first, then decreases
        System.out.println("After operations, a = " + a);

        // ---------------------- 4. Relational Operators ----------------------
        // These operators compare two values and return true or false.
        System.out.println("\n4. Relational Operators Examples : ");
        System.out.println("The following two numbers a & b are : " + a + " and " + b);
        System.out.println("a == b : " + (a == b));  // Checks if both are equal
        System.out.println("a != b : " + (a != b));  // Checks if both are not equal
        System.out.println("a > b  : " + (a > b));   // Checks if a is greater than b
        System.out.println("a < b  : " + (a < b));   // Checks if a is less than b
        System.out.println("a >= b : " + (a >= b));  // Checks if a is greater than or equal to b
        System.out.println("a <= b : " + (a <= b));  // Checks if a is less than or equal to b

        // ---------------------- 5. Logical Operators ----------------------
        // These operators are used with boolean conditions.
        // && -> Logical AND, || -> Logical OR, ! -> Logical NOT
        System.out.println("\n5. Logical Operators Examples : ");
        System.out.println("The following three numbers a, b and c are : " + a + ", " + b + " and " + c);
        System.out.println("(a > b) && (a < c): " + ((a > b) && (a < c))); // true if both conditions are true
        System.out.println("(a > b) || (a > c): " + ((a > b) || (a > c))); // true if at least one is true
        System.out.println("!(a > b): " + !(a > b));                       // reverses the result

        // ---------------------- 6. Bitwise Operators ----------------------
        // Bitwise operators perform operations directly on binary representations of numbers.
        System.out.println("\n6. Bitwise Operators Examples : ");
        System.out.println("The following two numbers a & b are : " + a + " and " + b);

        System.out.println("a & b = " + (a & b));   // Bitwise AND: 1 only if both bits are 1
        System.out.println("a | b = " + (a | b));   // Bitwise OR: 1 if any bit is 1
        System.out.println("a ^ b = " + (a ^ b));   // Bitwise XOR: 1 only if bits are different
        System.out.println("~a = " + (~a));         // Bitwise NOT: flips all bits
        System.out.println("a << 1 = " + (a << 1)); // Left Shift: shifts bits left and add 0 at left side
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift: shifts bits right and add 0 at right side
    }
}
