public class Travel {
    //Attributes
    private String destination;
    private int durationDays;

    //Constructor
    public Travel(String destination, int durationDays) {
        this.destination = destination;
        this.durationDays = durationDays;
    }

    //Get and set
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDurationDays() {
        return durationDays;
    }
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }


}
