/*Structure of the class
Demonstration for the class Strcture

Definition: Class is a blueprint of an object*/ 


public class Team {
    // Variables
    String team_name;
    int team_id;
    String team_role;
    String mem_name;
    // method
    public void coach() {
        String msg = "Sunder sir";
        System.out.println("The details are as follows" + " " + team_id + " " + team_name + " " + mem_name+" "+ team_role+ " " +"Coach is: "+ msg);
    }
}
