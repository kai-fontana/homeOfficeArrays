package classes.utilizadas;

public class Student {
    //Attributes
    private String name;
    private double grades;

    //Constructor
    public Student(String name, double grades) {
        this.name = name;
        this.grades = grades;
    }

    //Get and set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getGrades() {
        return grades;
    }
    public void setGrades(double grades) {
        this.grades = grades;
    }

    //toString Method
    @Override
    public String toString() {
        return "Name: " + name + "\nGrades: " + grades;
    }
}
