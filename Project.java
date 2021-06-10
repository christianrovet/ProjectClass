public class Project{
    private String name;
    private String description;

    public Project(){}

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch(){
        System.out.println(this.name + ":" + this.description);
        return (this.name + ":" + this.description);
    }
}