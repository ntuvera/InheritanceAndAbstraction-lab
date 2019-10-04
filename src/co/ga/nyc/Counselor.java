package co.ga.nyc;

public class Counselor implements Faculty {
    private String name;
    private boolean isAdministrator;
    private boolean isTeacher;
    private boolean hasTenure;

    public Counselor(String name) {
        this.name = name;
    }
    public void counselStudent(){
        System.out.println("Talks to students candidly");
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public boolean isAdministrator(){
        System.out.println("Can Expel students");
        return this.isAdministrator;
    }
    @Override
    public boolean isTeacher(){
        System.out.println("Can give students detention");
        return this.isTeacher;
    }
    @Override
    public boolean hasTenure(){
        System.out.println("Can do whatever they want");
        return this.hasTenure;
    }
}
