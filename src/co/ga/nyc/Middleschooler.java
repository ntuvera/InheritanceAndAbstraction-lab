package co.ga.nyc;

public class Middleschooler implements Student{
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
        System.out.println("was maked present");
    }
    @Override
    public void missClass(){
        System.out.println("was maked absent");
    }
    @Override
    public void tardyToClass(){
        System.out.println("was maked present");
    }
}
