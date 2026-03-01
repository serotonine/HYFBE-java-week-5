package dates.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Example 4: Formatting and Parsing Dates
 * 
 * This example demonstrates:
 * - Parsing dates from strings
 * - Formatting dates to strings
 * - Using predefined and custom patterns
 * - Using different locales
 */
public class Example4 {
    public static void main(String[] args) {
        System.out.println("=== PARSING (String to LocalDate) ===\n");
        
        // Parsing ISO format (default): yyyy-MM-dd
        LocalDate date1 = LocalDate.parse("2026-03-15");
        System.out.println("Parsed ISO date: " + date1);
        
        // Parsing with custom format
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date2 = LocalDate.parse("15/03/2026", formatter1);
        System.out.println("Parsed dd/MM/yyyy: " + date2);
        
        // Another custom format
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate date3 = LocalDate.parse("15-Mar-2026", formatter2);
        System.out.println("Parsed dd-MMM-yyyy: " + date3);
        
        System.out.println("\n=== FORMATTING (LocalDate to String) ===\n");
        
        LocalDate today = LocalDate.now();
        System.out.println("Today (default): " + today);
        
        // Common custom formats
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("dd/MM/yyyy: " + today.format(fmt1));
        
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("MM-dd-yyyy: " + today.format(fmt2));
        
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("dd MMM yyyy: " + today.format(fmt3));
        
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println("Full date: " + today.format(fmt4));
        
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("yyyy/MM/dd: " + today.format(fmt5));
        
        System.out.println("\n=== PREDEFINED FORMATTERS ===\n");
        
        System.out.println("ISO_DATE: " + today.format(DateTimeFormatter.ISO_DATE));
        System.out.println("BASIC_ISO_DATE: " + today.format(DateTimeFormatter.BASIC_ISO_DATE));
        
        System.out.println("\n=== LOCALIZED FORMATS ===\n");
        
        // Different locales
        DateTimeFormatter shortUS = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                                                     .withLocale(Locale.US);
        System.out.println("US Short: " + today.format(shortUS));
        
        DateTimeFormatter mediumUS = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                                                      .withLocale(Locale.US);
        System.out.println("US Medium: " + today.format(mediumUS));
        
        DateTimeFormatter longUS = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
                                                    .withLocale(Locale.US);
        System.out.println("US Long: " + today.format(longUS));
        
        System.out.println("\n=== REAL-WORLD USE CASE ===\n");
        
        // Reading user input (simulated)
        String userInput = "25/12/2026";
        DateTimeFormatter userFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate christmas = LocalDate.parse(userInput, userFormatter);
        
        System.out.println("User entered: " + userInput);
        System.out.println("Parsed as: " + christmas);
        System.out.println("Display format: " + christmas.format(
            DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
    }
}
