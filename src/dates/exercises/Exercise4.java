package dates.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Exercise 4: Date Formatting and Parsing
 * 
 * Scenario: You're building a system that needs to handle dates in different formats
 * 
 * TODO: Complete the following tasks
 * 
 * 1. Parse the following date string: "15/03/2026" (dd/MM/yyyy format)
 * 2. Parse this date string: "2026-12-25" (ISO format - default)
 * 3. Format today's date as "dd-MM-yyyy"
 * 4. Format today's date as "EEEE, MMMM dd, yyyy" (e.g., "Saturday, March 01, 2026")
 * 5. Create a method that takes a date string in "MM/dd/yyyy" format and 
 *    returns it formatted as "dd MMMM yyyy"
 * 6. Parse and format the date "25-Dec-2026" to "yyyy/MM/dd"
 * 7. BONUS: Handle a date parsing error gracefully using try-catch
 */
public class Exercise4 {
    public static void main(String[] args) {
        // TODO: Task 1 - Parse "15/03/2026"
        String dateStr1 = "15/03/2026";
        
        
        // TODO: Task 2 - Parse "2026-12-25" (ISO format)
        String dateStr2 = "2026-12-25";
        
        
        // TODO: Task 3 - Format today as "dd-MM-yyyy"
        LocalDate today = LocalDate.now();
        
        
        // TODO: Task 4 - Format today as "EEEE, MMMM dd, yyyy"
        
        
        // TODO: Task 5 - Use the method to convert "12/25/2026"
        String result = convertDateFormat("12/25/2026");
        System.out.println("Converted date: " + result);
        
        
        // TODO: Task 6 - Parse and reformat "25-Dec-2026"
        String dateStr3 = "25-Dec-2026";
        
        
        // TODO: BONUS - Try parsing an invalid date and handle the error
        String invalidDate = "32/13/2026"; // Invalid date
        
    }
    
    /**
     * TODO: Task 5 - Implement this method
     * Converts date from "MM/dd/yyyy" format to "dd MMMM yyyy" format
     * 
     * @param dateString Date in MM/dd/yyyy format
     * @return Formatted date string in dd MMMM yyyy format
     */
    public static String convertDateFormat(String dateString) {
        // Your code here
        return "";
    }
}
