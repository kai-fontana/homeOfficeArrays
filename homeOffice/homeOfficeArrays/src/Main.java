import exercise03.Book;
import exercise06.Animal;
import exercise10.Athlete;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //PRODUCT

        exercise02.Product product01 = new exercise02.Product("Charger", 19.99);
        exercise02.Product product02 = new exercise02.Product("Phone", 960.50);
        exercise02.Product product03 = new exercise02.Product("Computer", 1200.90);
        exercise02.Product product04 = new exercise02.Product("Mouse", 30.80);

        //ArrayList
        ArrayList<exercise02.Product> listOfProducts = new ArrayList<>();

        //Adding elements to the ArrayList
        listOfProducts.add(0, product01);
        listOfProducts.add(1, product02);
        listOfProducts.add(2, product03);
        listOfProducts.add(3, product04);

        //Showing the list
        System.out.println("Full list: " + listOfProducts.toString());
        System.out.println("There is: " + listOfProducts.size() + " products.");

        exercise02.Product expensiveProduct = listOfProducts.get(0);

        //Most expensive product 
        for (exercise02.Product actualProduct : listOfProducts) {
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
        ArrayList<exercise04.Student> listOfStudents = new ArrayList<>();

        exercise04.Student student01 = new exercise04.Student("Kai", 9.9);
        exercise04.Student student02 = new exercise04.Student("James", 9.6);
        exercise04.Student student03 = new exercise04.Student("Charles", 6.20);
        exercise04.Student student04 = new exercise04.Student("Melanie", 3.80);

        listOfStudents.add(0, student01);
        listOfStudents.add(1, student02);
        listOfStudents.add(2, student03);
        listOfStudents.add(3, student04);

        System.out.println("All students: " + listOfStudents.toString());

        //Average note
        double sumNotes = 0.0;
        for (exercise04.Student student : listOfStudents) {
            sumNotes += student.getGrades();
        }
        double averageGrades = sumNotes / listOfStudents.size();
        System.out.println("The average grade is: " + averageGrades);

        //Approved students
        for (exercise04.Student student : listOfStudents) {
            if (student.getGrades() >= 7.0) {
                System.out.println("Aprovado(a): " + student);
            }

            //----------------------------------

        //CARS
        exercise05.Car car01 = new exercise05.Car("Onix", 2024, "White");
        exercise05.Car car02 = new exercise05.Car("Uno", 2016, "Black");
        exercise05.Car car03 = new exercise05.Car("Sedan", 2021, "Red");

        ArrayList<exercise05.Car> listOfCars = new ArrayList<>();

        listOfCars.add(0, car01);
        listOfCars.add(1, car02);
        listOfCars.add(2, car03);

            //Only red cars
        for (exercise05.Car car : listOfCars) {
            if (car.getColor().equals("Red")) {
                 System.out.println(car);
                }
            }

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
        exercise07.Travel travel01 = new exercise07.Travel("South Korea", 18);
        exercise07.Travel travel02 = new exercise07.Travel("Santa Maria City", 12);
        exercise07.Travel travel03 = new exercise07.Travel("Tramandai Beach", 5);
        exercise07.Travel travel04 = new exercise07.Travel("Cridreira Beach", 7);

        ArrayList<exercise07.Travel> listOfTravels = new ArrayList<>();

        listOfTravels.add(0, travel01);
        listOfTravels.add(1, travel02);
        listOfTravels.add(2, travel03);
        listOfTravels.add(3, travel04);

       System.out.println("Full list: " + listOfTravels);

      //Longer than 7 days
       for (exercise07.Travel travel : listOfTravels) {
            if (travel.getDurationDays() >= 7) {
                System.out.println("Travels with duration greater than 7 days: " + travel);
                }
            }


            //----------------------------------

       //RECIPES

       exercise08.Recipe recipe01 = new exercise08.Recipe("Tiramisu", 40);
       exercise08.Recipe recipe02 = new exercise08.Recipe("Baked chicken with potatoes and carrots", 120);
       exercise08.Recipe recipe03 = new exercise08.Recipe("Carbona", 30);
       exercise08.Recipe recipe04 = new exercise08.Recipe("Steak with french fries", 20);

       ArrayList<exercise08.Recipe> listOfRecipes = new ArrayList<>();

       listOfRecipes.add(0, recipe01);
       listOfRecipes.add(1, recipe02);
       listOfRecipes.add(2, recipe03);
       listOfRecipes.add(3, recipe04);

            //Faster preparation recipes
       for (exercise08.Recipe recipe : listOfRecipes) {
            if (recipe.getPreparationTime() <= 29) {
                 System.out.println("Recipes that take less time to prepare: " + recipe);
                }
            }

            //----------------------------------

        //MOVIES
       exercise09.Movie movie01 = new exercise09.Movie("Harry Potter and the half-blood prince", "Fantasy", 9.9);
       exercise09.Movie movie02 = new exercise09.Movie("K-pop Demon Hunters", "Animation", 8.5);
       exercise09.Movie movie03 = new exercise09.Movie("Ratatouille", "Drama", 10.0);
       exercise09.Movie movie04 = new exercise09.Movie("Pride and prejudice", "Romance", 7.6);

       ArrayList<exercise09.Movie> listOfMovies = new ArrayList<>();

       listOfMovies.add(0, movie01);
       listOfMovies.add(1, movie02);
       listOfMovies.add(2, movie03);
       listOfMovies.add(3, movie04);

       System.out.println("Full list: " + listOfMovies);

            //Greater than 8 ratings
       for (exercise09.Movie movie : listOfMovies) {
            if (movie.getRating() > 8) {
                 System.out.println("Greater than 8 ratings: " + movie);
                }
            }


            //----------------------------------
       //ATHLETES
       Athlete athlete01 = new Athlete("Rebecca Andrade", "Artistic gymnastics", 9.9);
       Athlete athlete02 = new Athlete("Rayssa Leal", "Street skating", 7.8);
       Athlete athlete03 = new Athlete("Jaqueline Silva", "Beach volley", 8.9);
       Athlete athlete04 = new Athlete("Beatriz Souza", "Judo", 10.0);

       ArrayList<Athlete> listOfAthletes = new ArrayList<>();

       listOfAthletes.add(0, athlete01);
       listOfAthletes.add(1, athlete02);
       listOfAthletes.add(2, athlete03);
       listOfAthletes.add(3, athlete04);

       System.out.println("Full list: " + listOfAthletes);

       Athlete higherScore = listOfAthletes.get(0);
       for (Athlete actualScore : listOfAthletes) {
           if (actualScore.getScore() > higherScore.getScore()) {
               higherScore = actualScore;
               System.out.println("The highest score is: " + higherScore);
                }
            }
        }
    }
}

