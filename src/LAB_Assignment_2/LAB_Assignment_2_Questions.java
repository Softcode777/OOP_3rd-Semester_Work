package LAB_Assignment_2;

public class LAB_Assignment_2_Questions {
//    Question 1: [ 5 x 2 = 10 ]

//    Scenario 01: Time Management System
//    A digital clock application requires a Time Management System that ensures valid time input and
//    provides time display functionality.
//    Problem Statement:
//             Define a Time class with three private attributes: hours, minutes, and seconds.
//             Implement two constructors:
//    o One to initialize the time with default values (00:00:00).
//    o Another to allow user-defined values with validation checks to ensure valid time input
//            (hours: 0-23, minutes: 0-59, seconds: 0-59).
//             Provide a displayTime() method to print the current time.
//             Implement a main method to create multiple Time objects with valid and invalid values, ensuring
//    proper validation.


//    Scenario 2: Book Comparison System
//    A book management system requires an Encapsulated Book class to compare books based on their
//            authors and chapter count.
//    Problem Statement:
//             Define an encapsulated Book class with attributes:
//    o author (String)
//    o chapterNames[100] (String array for storing chapter names)
//             Implement two overloaded constructors:
//    o A no-argument constructor.
//    o A parameterized constructor with author and chapterNames.
//             Create a method compareBooks(Book b) that compares the authors of two books and returns true
//            if both books have the same author, otherwise false.
//             Create a method compareChapterNames(Book b) that compares the number of chapters between
//    two books and returns the book with more chapters.
// Implement a Runner class that:
//    o Creates two Book objects (one using the no-argument constructor and another with the
//            parameterized constructor).
//    o Uses setter methods to assign values to the first book.
//    o Calls compareBooks() and compareChapterNames() and displays the results.


//    Scenario 3: Pizza Order System
//    A pizza delivery service requires a Pizza Order System to manage customer orders efficiently.
//    Problem Statement:
//             Define a Pizza class with private instance variables for:
//    o size (small, medium, large)
//    o cheeseToppings
//    o pepperoniToppings
//    o hamToppings
// Implement constructors to initialize all variables.
//             Provide public getter and setter methods.
//             Implement calcCost() to compute the total cost:
//    o Small: $10 + $2 per topping
//    o Medium: $12 + $2 per topping
//    o Large: $14 + $2 per topping
// Implement getDescription() to return the pizza details.
// Create a PizzaOrder class that holds up to three Pizza objects and calculates the total cost.
//             Write a main method to test multiple pizzas and display their total cost.
//


//    Scenario 4: Publishing Company System
//    A publishing company markets both book and audio-cassette versions of its works. The system should
//    include:
//             A Publication class with title and price attributes.
//             A Book class derived from Publication that adds a pageCount attribute.
//             A Tape class derived from Publication that adds a playingTime attribute (in minutes).
//    Problem Statement:
//             Implement set() and get() methods for each class.
//             Implement a display() function in each class to print its details.
//             Write a main() method to create instances of Book and Tape, allowing user input for details and
//    displaying them using display().
}
