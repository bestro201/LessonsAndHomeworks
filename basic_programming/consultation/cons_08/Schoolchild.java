public class Schoolchild extends Person{

    private int classNumber;
    private double avgGrade;

    public Schoolchild(String name, int age, int classNumber, double avgGrade) {
        super(name, age);
        this.classNumber = classNumber;
        this.avgGrade = avgGrade;
    }
}
