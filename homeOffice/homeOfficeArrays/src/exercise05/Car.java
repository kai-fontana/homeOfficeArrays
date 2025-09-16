package exercise05;

public class Car {
    //Attributes
    private String model;
    private int year;
    private String color;

    //Constructor
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    //Get and set
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //toString method
    @Override
    public String toString() {
        return "Model: " + model + "\nYear: " + year + "\nColor: " + color;
    }
}
