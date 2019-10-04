package co.ga.nyc;

public class Preschooler implements Student{
    public static void fingerPaints(){
        System.out.println("I has colors on my fingers!!");
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
