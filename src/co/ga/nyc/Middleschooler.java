package co.ga.nyc;

public class Middleschooler extends Student{
    private String name;
    private int grade;
    private String team;

    public Middleschooler(String name, int grade, String team) {
        this.name = name;
        this.grade = grade;
        this.team = team;
    }

    public static void hasCooties(){
        System.out.println("Ew! You're gross!");
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
