package co.ga.nyc;

public class Highschooler extends Student{
    private String name;
    private int grade;
    private boolean scholarship;

    public Highschooler(String name, int grade, boolean scholarship) {
        this.name = name;
        this.grade = grade;
        this.scholarship = scholarship;
    }

    public static void gossip(){
        System.out.println("Did you hear about...");
    }
    @Override
    public void passGrade(){
        System.out.println("moved to the next grade");
    }
    @Override
    public void failGrade(){
        System.out.println("needs to repeat the grade");
    }
    @Override
    public void attendClass(){
        System.out.println("was marked present");
    }
    @Override
    public void skipClass(){
        System.out.println("was marked absent");
    }
}
