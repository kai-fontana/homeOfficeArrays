package exercise09;

public class Movie {
    //Attributes
    private String title;
    private String genre;
    private double rating;

    //Constructor
    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    //Get and set
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    //toString method
    @Override
    public String toString() {
        return "Title: " + title + "\nGenre " + genre + "\nRating: " + rating;
    }
}
