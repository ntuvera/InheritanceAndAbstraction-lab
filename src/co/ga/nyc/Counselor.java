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
    public void isAdministrator(){
        System.out.println("Can Expel students");
    }
    @Override
    public void isTeacher(){
        System.out.println("Can give students detention");
    }
    @Override
    public void hasTenure(){
        System.out.println("Can do whatever they want");
    }
}
