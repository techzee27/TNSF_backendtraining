public class Controlstatements {
    /* Control statements in Java are fundamental constructs that manage the flow of execution within a program. 
    They allow for decision-making, repetitive actions, and the transfer of control to different parts of the code. 
    
    Types of Control Statements in Java
    Java has three types of control flow statements in Java:

    1.Decision Making (if, if-else, else if, else)
    2.Loop (while, Do - while, For , Enhanced For)
    3.Jump (break, continue)
    */

    // I am considering College Morning Routine as an example to explain the Decision Making Statements

    int wakeUpTime;         // Variable to store the time you wake up
    int mobileCharging;     // Variable to store the mobile battery percentage
    String []lectures;      // Array to store the list of lectures

    public void college_Routine()
    {
        // ---------------------------
        // Decision Making Statements
        // ---------------------------
        System.out.println("Decision Making Statements:");
        
        // Check if the student woke up early
        if(wakeUpTime<7)
        {
            System.out.println("You woke up early, Study anyone subject");
        }
        // Check if the student woke up exactly at 7
        else if(wakeUpTime==7)
        {
            System.out.println("You are on time");
        }
        // Check if the student woke up between 7 and 8
        else if(wakeUpTime<=8)
        {
            System.out.println("You are too Late, you must hurry");
        }
        // If none of the above conditions are true
        else
        {
            System.out.println("not willing to go to college");
        }

        // ---------------------------
        // Looping Statements
        // ---------------------------
        System.out.println("Looping Statements:");
        
        // While loop to simulate battery draining process
        while(mobileCharging>=20)
        {
            System.out.println("The Battery percentage is "+ mobileCharging+" you can continue working");
            mobileCharging-=20; // Decrementing the charging percentage by 20 each time
        }
        System.out.println("connect Charger"); // Message when battery is below 20%

        // Enhanced for loop to print each lecture name
        for(String lecture:lectures)
        {
            System.out.println(lecture);
        }

        // ---------------------------
        // Jump Statements
        // ---------------------------
        System.out.println("Jump Statements:");

        System.out.println("Loop starts:\n");

        // For loop to demonstrate 'break' and 'continue'
        for (int i = 1; i <= 10; i++) {

            // Skip even numbers using continue
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue;  // jumps to next iteration without executing further statements in loop body
            }

            // Stop the loop when number is greater than 7
            if (i > 7) {
                System.out.println("Number greater than 7 found: " + i);
                System.out.println("Breaking the loop!");
                break;  // exits the loop completely
            }

            // Print the current number if no conditions above are met
            System.out.println("Current number: " + i);
        }

        // Loop ends after break condition is met
        System.out.println("\nLoop ended.");
    }

}
