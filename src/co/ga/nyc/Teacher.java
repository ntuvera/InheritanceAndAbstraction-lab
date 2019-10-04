package co.ga.nyc;

public class Teacher implements Faculty{
    private String name;
    private int grade;
    private boolean isAdministrator;
    private boolean isTeacher;
    private boolean hasTenure;

    public Teacher(String name, int grade, boolean isAdministrator, boolean isTeacher, boolean hasTenure) {
        this.name = name;
        this.grade = grade;
        this.isAdministrator = isAdministrator;
        this.isTeacher = isTeacher;
        this.hasTenure = hasTenure;
    }

    public int getGrade(){
        System.out.println("Teaches " + this.grade + " grade.");
        return this.grade;
    }

    @Override
    public String getName(){
        System.out.println("Teacher is not at admin level");
        return "Mr/Mrs/Ms " + this.name;
    }

    @Override
    public boolean isAdministrator(){
        System.out.println("Teacher is not at admin level");
        return this.isAdministrator;
    }
    @Override
    public boolean isTeacher(){
        System.out.println("Teacher is a teacher");
        return this.isTeacher;
    }
    @Override
    public boolean hasTenure(){
        System.out.println("Can do whatever they want");
        return this.hasTenure;
    }
}
