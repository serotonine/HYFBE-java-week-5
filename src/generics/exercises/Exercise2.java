package generics.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercise 2: Generic Methods and Bounded Types
 * 
 * Tasks:
 * 1. Write a generic method printArray(T[] array) that prints all elements
 *    - Try it with String[], Integer[], and Double[] arrays
 * 
 * 2. Write a generic method reverse(T[] array) that returns a new array
 *    with elements in reverse order
 *    - Try with different array types
 * 
 * 3. Write a method findMin(List<? extends Number> numbers) that returns
 *    the smallest number as a double
 *    - Try with List<Integer> and List<Double>
 * 
 * 4. Create a generic class Calculator<T extends Number>
 *    - Add add(), subtract(), multiply() methods that work with T
 *    - Return results as double
 *    - Try with Integer and Double
 * 
 * 5. Write a method countGreaterThan(T[] array, T element) that counts
 *    how many elements are greater than the given element
 *    - T must be Comparable
 *    - Try with different types
 */
public class Exercise2 {
    
    public static void main(String[] args) {
        System.out.println("=== Task 1: Print Array ===\n");
        
        // Call printArray method
        /*
         * Write a generic method printArray(T[] array) that prints all elements
         * Try it with String[], Integer[], and Double[] arrays
        */
        String[] words = {"Hello", "World", "Java"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        printArray(words);
        printArray(numbers);

        
        System.out.println("\n=== Task 2: Reverse Array ===\n");
        /*
         *  Write a generic method reverse(T[] array) that returns a new array
         *  with elements in reverse order
         *  Try with different array types
         *
         */
        
        // TODO: Call reverse method
        reverse(words);
        printArray(words);
        reverse(numbers);
        printArray(numbers);
        
        
        System.out.println("\n=== Task 3: Find Minimum ===\n");
        /*
         * Write a method findMin(List<? extends Number> numbers) that returns
         * the smallest number as a double
         * Try with List<Integer> and List<Double>
         *
         */
        // Call findMin method
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(20);
        integers.add(3);
        integers.add(456);
        integers.add(-30);
        List<Double> doubles = new ArrayList<>();
        doubles.add(10.99);
        doubles.add(5.67);
        doubles.add(20.90);
        doubles.add(3.76);
        doubles.add(456.33);
        doubles.add(-30.5);
        System.out.println("Min integer = " + findMin(integers));
        System.out.println("Min double = " + findMin(doubles));

        System.out.println("\n=== Task 4: Calculator ===\n");
        /*
         * Create a generic class Calculator<T extends Number>
         * Add add(), subtract(), multiply() methods that work with T
         * Return results as double
         * Try with Integer and Double
         */
        
        // Create and use Calculator instances
        Calculator<Integer> calculator = new Calculator<>();
        System.out.printf("Add int => %.2f%n" , calculator.add(5,5,10));
        System.out.printf("Substract int => %.2f%n" , calculator.substract(5,5,10));
        System.out.printf("Multiply int => %.2f%n" , calculator.multiply(5,5,10));
        Calculator<Double> calculatorD = new Calculator<>();
        System.out.printf("Add double => %.2f%n" , calculatorD.add(5.5,5.5,10.99));
        System.out.printf("Substract double => %.2f%n" , calculatorD.substract(5.5,5.5,10.99));
        System.out.printf("Multiply double => %.2f%n" , calculatorD.multiply(5.5,5.5,10.99));

        
        
        System.out.println("\n=== Task 5: Count Greater Than ===\n");
        /*
         * Write a method countGreaterThan(T[] array, T element) that counts
         * how many elements are greater than the given element
         * T must be Comparable
         * Try with different types
         */
        
        // Call countGreaterThan method
        List<String> greatersS = countGreaterThan(new String[]{"Babar", "Arseneisafuckman", "Zoe"}, "Babarissonet");

        System.out.println("Size " + greatersS.size());
        System.out.println(greatersS);

        List<Double> greatersI = countGreaterThan(new Double[]{4.89,7.98,9.99}, 7.95);

        System.out.println("Size " + greatersI.size());
        System.out.println(greatersI);




        
    }
    
    // Task 1 - Implement printArray method
    public static <T> void printArray(T[] array){

        for(int i=0; i< array.length; i ++){
            if(i == array.length - 1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();

    }
    
    
    // Task 2 - Implement reverse method
    public static <T> T[] reverse(T[] array){
        int left = 0;
        int right =array.length -1;
        while(left < right){
           T temp = array[left];
           array[left] = array[right];
           array[right] = temp;
           left++;
           right--;
        }

        return array;

    }
    
    
    // Task 3 - Implement findMin method
    public static <T extends Number> double findMin(List<? extends Number> numbers ){
        double min = (numbers.getFirst()).doubleValue();
        for(int i = 1; i< numbers.size(); i++){
            double d = (numbers.get(i)).doubleValue();
            if(min > d){
                min =  d;
            }
        }

        return min;
    }
    
    
    // Task 5 - Implement countGreaterThan method
    public static <T extends Comparable<T>>List<T> countGreaterThan(T[] array,T element){
        List <T> results = new ArrayList<>();
        for(T item:array){

                if(item.compareTo(element) > 0 ){
                    results.add(item);
                }

        }
        return results;
    }
    
}

// Task 4 - Create Calculator<T extends Number> class here
class Calculator<T extends Number>{
    // Add.
    public double add(T ...args){
        double total=args[0].doubleValue();
        for (int i = 1; i < args.length; i++) {
            total += (args[i]).doubleValue();
        }
        return total;
    }
    // Substract.
    public double substract(T ...args){
        double total=args[0].doubleValue();
        for (int i = 1; i < args.length; i++) {
            total -= (args[i]).doubleValue();
        }
        return total;
    }
    // Multiply.
    public double multiply(T ...args){
        double total=args[0].doubleValue();
        for (int i = 1; i < args.length; i++) {
            total *= (args[i]).doubleValue();
        }
        return total;
    }

}
