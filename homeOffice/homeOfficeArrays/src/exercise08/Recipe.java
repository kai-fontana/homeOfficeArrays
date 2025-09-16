package exercise08;

public class Recipe {
    //Atributes
    private String name;
    private double preparationTime;

    //Constructor
    public Recipe(String name, double preparationTime) {
        this.name = name;
        this.preparationTime = preparationTime;
    }

    //Get and set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPreparationTime() {
        return preparationTime;
    }
    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }

    //toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nPreparation time: " + preparationTime;
    }
}
