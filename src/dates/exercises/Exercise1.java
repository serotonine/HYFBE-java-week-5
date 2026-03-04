package dates.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Exercise 1: Basic Date and Time Operations
 *  Complete the following tasks
 *
 * 1. Create a LocalDate for your birthday
 * 2. Print your birthday in the format: "I was born on [day of week], [month] [day], [year]"
 * 3. Find out if your birth year was a leap year
 * 4. Create a LocalTime for when you usually wake up
 * 5. Create a LocalDateTime combining your birthday and wake-up time
 * 6. Print how many days old you are today
 * 7. Print which day of the year you were born on (1-365)
 */
public class Exercise1 {
    public static void main(String[] args) {
        // Task 1 - Create your birthday
        LocalDate birthday = LocalDate.of(1970,10,16);

        // Task 2 - Print formatted birthday message
        DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE dd MMMM Y");
        System.out.println("I'm born a " + birthday.format(f));
        

        // Task 3 - Check if leap year
        String response = birthday.isLeapYear() ? "My birthday is a leap year.": "My birthday is NOT a leap year.";
        System.out.println(response);


        // Task 4 - Print day of year you were born
        System.out.println("I'm born the " + birthday.getDayOfYear() + "th day of the year " + birthday.getYear());
        System.out.println("It was a "+ birthday.getDayOfWeek() + ".");

    }
}
