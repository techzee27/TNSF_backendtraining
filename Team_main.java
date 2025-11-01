public class Team_main {
    public static void main(String[] args) {
        Team t1= new Team();
        t1.team_name="Digital Dynamos";
        t1.team_id=2723;
        t1.mem_name="Zeeshan";
        t1.team_role="Frontend Developer";
        t1.coach();

        Team t2= new Team();
        t2.team_id=2627;
        t2.team_name="Digital Dynamos";
        t2.mem_name="Rohan";
        t2.team_role="Backend Developer";
        t2.coach();
    }    
    
}