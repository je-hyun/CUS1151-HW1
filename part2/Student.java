package part2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 A class to represent a student.
 */
public class Student implements Comparable<Student>
{
    private String firstName;
    private String lastName;
    private int id;

    /**
     The id getter
     @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     Constructs a new student with a given first and last name, and id
     @param firstName
     @param lastName
     @param id
     */
    public Student(String firstName, String lastName, int id)
    {
        //TO Do; complete the Constructor OK
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     Compares students by sorting by last name. If last names are equal, then by first name, if first names are identical, then by id.
     @param other the other student to compare with
     */
    public int compareTo(Student other)
    {
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare != 0)
        {
            return lastNameCompare;
        }

        int firstNameCompare = this.firstName.compareTo(other.firstName);
        //TO DO; write code to compare firs name OK
        if (firstNameCompare != 0)
        {
            return firstNameCompare;
        }
        return this.id - other.id;
    }

    /**
     Determines equality based on string values
     */
    public boolean equals(Object obj)
    {
        return this.compareTo((Student) obj) == 0;
    }

    /**
     Generates a string of the student in the form: lastname, firstname id
     */
    public String toString()
    {
        return lastName + ", " + firstName + " " + id;
    }

    /**
     Creates a new student based on user input
     @return a new student with values defined by user input
     */
    public static Student createStudent()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String first = in.next();
        // TO Do; write code to assign first name OK
        System.out.println("Please enter last name: ");
        // TO Do; write code to assign last name OK
        String last = in.next();
        System.out.println("Please enter ID: ");
        int id = -1;
        boolean idInputSuccess = false;
        while (!idInputSuccess) {
            try {
                id = in.nextInt();
                idInputSuccess = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid integer input. Try again.");
                in.nextLine(); // This line is to clear the input buffer.
            }
        }
        return new Student(first, last, id);
    }

}