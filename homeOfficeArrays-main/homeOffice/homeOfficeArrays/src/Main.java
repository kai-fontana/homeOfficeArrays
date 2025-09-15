import classes.utilizadas.Animal;
import classes.utilizadas.Athletes;
import classes.utilizadas.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //PRODUCT
        /*
        classes.utilizadas.Product product01 = new classes.utilizadas.Product("Charger", 19.99);
        classes.utilizadas.Product product02 = new classes.utilizadas.Product("Phone", 960.50);
        classes.utilizadas.Product product03 = new classes.utilizadas.Product("Computer", 1200.90);
        classes.utilizadas.Product product04 = new classes.utilizadas.Product("Mouse", 30.80);

        //ArrayList
        ArrayList<classes.utilizadas.Product> listOfProducts = new ArrayList<>();

        //Adding elements to the ArrayList
        listOfProducts.add(0, product01);
        listOfProducts.add(1, product02);
        listOfProducts.add(2, product03);
        listOfProducts.add(3, product04);

        //Showing the list
        System.out.println("Full list: " + listOfProducts.toString());
        System.out.println("There is: " + listOfProducts.size() + " products.");

        classes.utilizadas.Product expensiveProduct = listOfProducts.get(0);

        //Most expensive product 
        for (classes.utilizadas.Product actualProduct : listOfProducts) {
            if (actualProduct.getPrice() > expensiveProduct.getPrice()) {
                expensiveProduct = actualProduct;

            }
        }
        System.out.println("The most expensive product is: " + expensiveProduct);

        //----------------------------------

        //BOOKS
        Book book01 = new Book("1984", "George Orwell", 1949);
        Book book02 = new Book("Pride and prejudice", "Jane Austen", 1813);
        Book book03 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997);

        //ArrayList
        ArrayList<Book> listOfBooks = new ArrayList<>();

        listOfBooks.add(0, book01);
        listOfBooks.add(1, book02);
        listOfBooks.add(2, book03);

        System.out.println("All books: " + listOfBooks);

        //Books released after 2010
        for (Book book : listOfBooks) {
            if (book.getYearOfPublication() > 2010) {
                System.out.println(book);
            }
        }

        //----------------------------------

        //STUDENTS
        ArrayList<classes.utilizadas.Student> listOfStudents = new ArrayList<>();

        classes.utilizadas.Student student01 = new classes.utilizadas.Student("Kai", 9.9);
        classes.utilizadas.Student student02 = new classes.utilizadas.Student("James", 9.6);
        classes.utilizadas.Student student03 = new classes.utilizadas.Student("Charles", 6.20);
        classes.utilizadas.Student student04 = new classes.utilizadas.Student("Melanie", 3.80);

        listOfStudents.add(0, student01);
        listOfStudents.add(1, student02);
        listOfStudents.add(2, student03);
        listOfStudents.add(3, student04);

        System.out.println("All students: " + listOfStudents.toString());

        //Average note
        double sumNotes = 0.0;
        for (classes.utilizadas.Student student : listOfStudents) {
            sumNotes += student.getGrades();
        }
        double averageGrades = sumNotes / listOfStudents.size();
        System.out.println("The average grade is: " + averageGrades);

        //Approved students
        for (classes.utilizadas.Student student : listOfStudents) {
            if (student.getGrades() >= 7.0) {
                System.out.println("Aprovado(a): " + student);
            }

            //----------------------------------
        //CARS
        classes.utilizadas.Car car01 = new classes.utilizadas.Car("Onix", 2024, "White");
        classes.utilizadas.Car car02 = new classes.utilizadas.Car("Uno", 2016, "Black");
        classes.utilizadas.Car car03 = new classes.utilizadas.Car("Sedan", 2021, "Red");

        ArrayList<classes.utilizadas.Car> listOfCars = new ArrayList<>();

        listOfCars.add(0, car01);
        listOfCars.add(1, car02);
        listOfCars.add(2, car03);

            //Only red cars
        for (classes.utilizadas.Car car : listOfCars) {
            if (car.getColor().equals("Red")) {
                 System.out.println(car);
                }
            }
        */
        //----------------------------------
    //ANIMAL

        Animal animal01 = new Animal("Buddy", "dog");
        Animal animal02 = new Animal("Daisy", "cat");
        Animal animal03 = new Animal("Charlie", "cat");

        ArrayList<Animal> listOfAnimals = new ArrayList<>();

        listOfAnimals.add(0, animal01);
        listOfAnimals.add(1, animal02);
        listOfAnimals.add(2, animal03);

        System.out.println("Full list: " + listOfAnimals);

        for (Animal animal : listOfAnimals) {
            if (animal.getSpecie().equals("Cat")) {
                System.out.println("Only one specie: " + animal);
            }
        }

        //----------------------------------

    //TRAVELING
/*
        classes.utilizadas.Travel travel01 = new classes.utilizadas.Travel("South Korea", 18);
        classes.utilizadas.Travel travel02 = new classes.utilizadas.Travel("Santa Maria City", 12);
        classes.utilizadas.Travel travel03 = new classes.utilizadas.Travel("Tramandai Beach", 5);
        classes.utilizadas.Travel travel04 = new classes.utilizadas.Travel("Cridreira Beach", 7);

        ArrayList<classes.utilizadas.Travel> listOfTravels = new ArrayList<>();

        listOfTravels.add(0, travel01);
        listOfTravels.add(1, travel02);
        listOfTravels.add(2, travel03);
        listOfTravels.add(3, travel04);

       System.out.println("Full list: " + listOfTravels);

      //Longer than 7 days
       for (classes.utilizadas.Travel travel : listOfTravels) {
            if (travel.getDurationDays() >= 7) {
                System.out.println("Travels with duration greater than 7 days: " + travel);
                }
            }


            //----------------------------------

       //RECIPES

       classes.utilizadas.Recipe recipe01 = new classes.utilizadas.Recipe("Tiramisu", 40);
       classes.utilizadas.Recipe recipe02 = new classes.utilizadas.Recipe("Baked chicken with potatoes and carrots", 120);
       classes.utilizadas.Recipe recipe03 = new classes.utilizadas.Recipe("Carbona", 30);
       classes.utilizadas.Recipe recipe04 = new classes.utilizadas.Recipe("Steak with french fries", 20);

       ArrayList<classes.utilizadas.Recipe> listOfRecipes = new ArrayList<>();

       listOfRecipes.add(0, recipe01);
       listOfRecipes.add(1, recipe02);
       listOfRecipes.add(2, recipe03);
       listOfRecipes.add(3, recipe04);

            //Faster preparation recipes
       for (classes.utilizadas.Recipe recipe : listOfRecipes) {
            if (recipe.getPreparationTime() <= 29) {
                 System.out.println("Recipes that take less time to prepare: " + recipe);
                }
            }

            //----------------------------------

        //MOVIES
       classes.utilizadas.Movie movie01 = new classes.utilizadas.Movie("Harry Potter and the half-blood prince", "Fantasy", 9.9);
       classes.utilizadas.Movie movie02 = new classes.utilizadas.Movie("K-pop Demon Hunters", "Animation", 8.5);
       classes.utilizadas.Movie movie03 = new classes.utilizadas.Movie("Ratatouille", "Drama", 10.0);
       classes.utilizadas.Movie movie04 = new classes.utilizadas.Movie("Pride and prejudice", "Romance", 7.6);

       ArrayList<classes.utilizadas.Movie> listOfMovies = new ArrayList<>();

       listOfMovies.add(0, movie01);
       listOfMovies.add(1, movie02);
       listOfMovies.add(2, movie03);
       listOfMovies.add(3, movie04);

       System.out.println("Full list: " + listOfMovies);

            //Greater than 8 ratings
       for (classes.utilizadas.Movie movie : listOfMovies) {
            if (movie.getRating() > 8) {
                 System.out.println("Greater than 8 ratings: " + movie);
                }
            }


            //----------------------------------
       //ATHLETES
       Athletes athlete01 = new Athletes("Rebecca Andrade", "Artistic gymnastics", 9.9);
       Athletes athlete02 = new Athletes("Rayssa Leal", "Street skating", 7.8);
       Athletes athlete03 = new Athletes("Jaqueline Silva", "Beach volley", 8.9);
       Athletes athlete04 = new Athletes("Beatriz Souza", "Judo", 10.0);

       ArrayList<Athletes> listOfAthletes = new ArrayList<>();

       listOfAthletes.add(0, athlete01);
       listOfAthletes.add(1, athlete02);
       listOfAthletes.add(2, athlete03);
       listOfAthletes.add(3, athlete04);

       System.out.println("Full list: " + listOfAthletes);

       Athletes higherScore = listOfAthletes.get(0);
       for (Athletes actualScore : listOfAthletes) {
           if (actualScore.getScore() > higherScore.getScore()) {
               higherScore = actualScore;
               System.out.println("The highest score is: " + higherScore);
                }
            }
        }*/
    }
}

