// Program: Looping Statements in Java
public class LoopingStatements {
    public static void main(String[] args) {

        // 1. For Loop
        // Used when the number of iterations is known in advance.
        System.out.println("1. For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. While Loop
        // Used when the number of iterations is not known, continues while condition is true.
        System.out.println("\n2. While Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // 3. Do-While Loop
        // Executes the body at least once before checking the condition.
        System.out.println("\n3. Do-While Loop:");
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 2);

        // 4. Enhanced For Loop (For-Each)
        // Used for iterating over arrays or collections easily.
        System.out.println("\n4. Enhanced For Loop:");
        String[] names = {"Alice", "Bob", "Charlie"};
        
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
