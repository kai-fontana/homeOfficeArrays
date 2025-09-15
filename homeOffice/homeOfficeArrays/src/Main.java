import classes.utilizadas.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //PRODUCT

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

        Book book01 = new Book("1984", "George Orwell" ,1949);
        Book book02 = new Book("Pride and prejudice", "Jane Austen" ,1813);
        Book book03 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling" ,1997);

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
        Car car01 = new Car("Onix", 2024, "White");
        Car car02 = new Car("Uno", 2016, "Black");
        Car car03 = new Car("Sedan", 2021, "Red");

        ArrayList<Car> listOfCars = new ArrayList<>();

        listOfCars.add(0, car01);
        listOfCars.add(1, car02);
        listOfCars.add(2, car03);

        //Only red cars
        for (Car car : listOfCars) {
            if (Car.getColor() == "Red") {
                System.out.println(car);
            }
        }
        }

        //----------------------------------



    }
}
