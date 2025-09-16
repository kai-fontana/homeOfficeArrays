package exercise03;

public class Book {
    //Atributes
    private String title;
    private String author;
    private int yearOfPublication;

    //Constructor
    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    //Get and set
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    //toString method
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear of publication: " + yearOfPublication;
    }
}
