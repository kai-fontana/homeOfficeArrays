public class Animal {
    //Attributes
    private String name;
    private String specie;

    //Constructor
    public Animal(String name, String specie) {
        this.name = name;
        this.specie = specie;
    }

    //Get and set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }

}
