package classes.utilizadas;

public class Athletes {
    //Attributes
    private String name;
    private String modality;
    private double score;

    //Constructor
    public Athletes(String name, String modality, double score) {
        this.name = name;
        this.modality = modality;
        this.score = score;
    }

    //Get and set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModality() {
        return modality;
    }
    public void setModality(String modality) {
        this.modality = modality;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    //toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nModality: " + modality + "\nScore: " + score;
    }
}
