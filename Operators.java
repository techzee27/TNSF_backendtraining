public class Operators {
    public static void main(String[] args) {
        byte a=7;
        byte b=2;
        byte c=5;
        System.out.println("The following two numbers a & b are : "+ a + " and " + b);

        // Operators In Java Language
        // Arithmetic Operators : Used for performing mathematical calculations. (+,-,*,/,%)
        System.out.println("\n1. Arithmetic Operators Examples : ");
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));

        // Assignment Operators: Used to assign values to variables.(=,+=,-=,*=,/=,%=)
        System.out.println("\n2. Assignment Operators Examples : ");
        int x = 10;
        System.out.println("x = " + x);
        x += 5;
        System.out.println("x += 5 : " + x);
        x -= 3;
        System.out.println("x -= 3 : " + x);
        x *= 2;
        System.out.println("x *= 2 : " + x);
        x /= 4;
        System.out.println("x /= 4 : " + x);
        x %= 3;
        System.out.println("x %= 3 : " + x);

        // Unary Operators: Operate on a single operand. (++,--,!)
        System.out.println("\n3. Unary Operators Examples : ");
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); // pre-increment
        System.out.println("--a = " + (--a)); // pre-decrement
        System.out.println("a++ = " + (a++)); // post-increment
        System.out.println("a-- = " + (a--)); // post-decrement
        System.out.println("After operations, a = " + a);

        // Relational (Comparison) Operators: Used to compare two values, resulting in a. (==,!=,>,<,>=,<=)
        System.out.println("\n4. Relational Operators Examples : ");
        System.out.println("The following two numbers a & b are : "+ a + " and " + b);
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators: Used to combine or modify boolean expressions. (&&,||,!)
        System.out.println("\n5. Logical Operators Examples : ");
        System.out.println("The following two numbers a,b and c are : "+ a + " and " + b + " and " + c);
        System.out.println("(a > b) && (a < c): " + ((a > b) && (a < c)));
        System.out.println("(a > b) || (a > c): " + ((a > b) || (a > c)));
        System.out.println("!(a > b): " + !(a > b));

        // Bitwise Operators: Perform operations on individual bits of integer types.
        System.out.println("\n6. Bitwise Operators Examples : ");
        System.out.println("The following two numbers a & b are : "+ a + " and " + b);
        System.out.println("a & b = " + (a & b));   // AND
        System.out.println("a | b = " + (a | b));   // OR
        System.out.println("a ^ b = " + (a ^ b));   // XOR
        System.out.println("~a = " + (~a));         // NOT
        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
    }
}
