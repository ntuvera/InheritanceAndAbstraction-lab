package co.ga.nyc;

public abstract class Student {
    private String name;
    private int grade;
    private double attendance;

    public abstract void passGrade();
    public abstract void failGrade();
    public abstract void attendClass();
    public abstract void skipClass();

}
