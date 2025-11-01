public class Student {
    // Instance Varibles
    int roll_No;
    String name;
    String course;
    //static variables
    static String college_Name="AVNIET";

    public void print()
    {
        String msg="TNSF Student";
        System.out.println("The Student details are "+" "+ roll_No + " "+ name + " " + course + " " + college_Name + " " + msg);
    }
}
