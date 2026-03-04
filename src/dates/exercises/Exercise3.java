package dates.exercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * Exercise 3: Period and Duration Calculations
 * 
 * Scenario: You need to calculate time differences for various situations
 *  Complete the following tasks
 * 
 * 1. Calculate your exact age in years, months, and days using Period
 * 2. Create a method that calculates the number of days between two dates
 * 3. Calculate the working hours in a day (9:00 AM to 5:30 PM) using Duration
 * 4. Add a 30-minute lunch break to calculate actual working time
 * 5. Calculate how many days are left until New Year's Day (January 1, 2027)
 * 6. Create a Period of 1 year, 6 months, and 15 days, then add it to today
 * 7. BONUS: Calculate how many full weeks are between your birthday and today
 */
public class Exercise3 {
    public static void main(String[] args) {
        // Task 1 - Calculate your age
        LocalDate birthday = LocalDate.of(1970, 02, 16);
        LocalDate today = LocalDate.now();
        int myAge = Period.between(birthday,today).getYears();
        System.out.println("My age: " + myAge);


        // Task 2 - Create a method to calculate days between dates
        // Call it with two different dates and print the result
        LocalDate nextBirthday = LocalDate.of(2027, 02, 16);

        System.out.println("Number of days to wait before my birthday: " + calculateDaysBetween( today,nextBirthday));

        // Task 3 - Calculate working hours
        LocalTime workStart = LocalTime.of(9, 0);
        LocalTime workEnd = LocalTime.of(17, 0);
        Duration workDay = Duration.between(workStart,workEnd);
        System.out.println("workDay " + workDay.toHours());

        // Task 4 - Calculate actual working time (subtract 30 min lunch)
        long init  = workDay.minusMinutes(30).getSeconds();
        long seconds = init % 60;
        long temp = (init - seconds) / 60;
        long minutes = temp % 60;
        long hours = (temp - minutes) / 60;
        if(seconds > 0){
            System.out.println("Actual working time: " + hours + ":" + minutes + ":" + seconds);
        }
        else{
            System.out.println("Actual working time: " + hours + ":" + minutes);
        }

        // Task 5 - Days until New Year 2027
        LocalDate newY = today.with(TemporalAdjusters.lastDayOfYear()).plusDays(1);
        long newYdays = newY.toEpochDay() - today.toEpochDay();
        System.out.println("Days until New Year 2027: " + newYdays);
        
        
        // Task 6 - Add period to today
        Period toNY = Period.between(today, newY);
        System.out.println("Add period to today: " +  today.plus(toNY));
        
        
        // TODO: BONUS - Calculate full weeks between birthday and today
        long fullWeeks = Math.round( newYdays / 7);
        System.out.println("Full weeks between birthday and today: " + fullWeeks );
        
    }
    
    // Task 2 - Implement this method
    public static long calculateDaysBetween(LocalDate start, LocalDate end) {

        return Math.abs(start.toEpochDay() - end.toEpochDay());
    }
}
