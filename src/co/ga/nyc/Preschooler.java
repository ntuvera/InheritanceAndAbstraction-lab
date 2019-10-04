package co.ga.nyc;

public class Preschooler extends Student{
    private String name;
    private int grade;
    private double attendance;

    public Preschooler(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void fingerPaints(){
        System.out.println("I has colors on my fingers!!");
    }
    @Override
    public void passGrade(){
        System.out.println("moved to the next grade");
        this.grade++;
    }
    @Override
    public void failGrade(){
        System.out.println("needs to repeat the grade");
    }
    @Override
    public void attendClass(){
        System.out.println("was marked present");
        this.attendance++;
    }
    @Override
    public void skipClass(){
        System.out.println("was marked absent");
    }
}
