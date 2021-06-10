public class ProjectTest {
    public static void main(String[] args){
        Project project = new Project();
        Project project2 = new Project("Christian :)");
        Project project3 = new Project("Christian", "Showing off his Dojo Mastery!!!!");

        project.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
    }
}