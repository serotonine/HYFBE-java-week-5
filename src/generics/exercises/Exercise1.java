package generics.exercises;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 1: Basic Generic Classes
 * 
 * Tasks:
 * 1. Create a generic class Container<T> that holds a single value
 *    - Add a constructor that takes a value
 *    - Add getValue() and setValue() methods
 *    - Add an isEmpty() method that returns true if value is null
 * 
 * 2. In main(), create instances for different types:
 *    - Container<String> with value "Hello"
 *    - Container<Integer> with value 100
 *    - Container<Boolean> with value true
 *    - Print all values
 * 
 * 3. Create a generic class Pair<K, V> with two values
 *    - Add getKey() and getValue() methods
 *    - Add a swap() method that returns a new Pair<V, K> with swapped values
 * 
 * 4. Try Pair with:
 *    - Pair<String, Integer> for ("age", 25)
 *    - Swap it and print both pairs
 */
public class Exercise1 {
    
    public static void main(String[] args) {
        System.out.println("=== Task 1 & 2: Container Class ===\n");
        
        // Create Container instances and use them
        Container s = new Container<String>("I am a String");
        Container i = new Container<Integer>(456);
        Container l = new Container<LocalDate>(LocalDate.now());
        Container a = new Container<List>(new ArrayList<>());
        Container n = new Container<Object>(null);

        s.printValue();
        i.printValue();
        l.printValue();
        a.printValue();
        System.out.println("If this value null? " + s.isEmpty());
        System.out.println("If this value null? " + n.isEmpty());

        System.out.println("\n=== Task 3 & 4: Pair Class ===\n");

        // Create Paire instances, try swap() method.
        Paire b = new Paire("Roberta", 24);
        System.out.println("Before swap");
        System.out.println(b.toString());
        Paire c = b.swap();
        System.out.println("After swap");
        System.out.println(c.toString());
    }
}

// Task 1 - Create Container<T> class here
class Container<T>{

    T value;
    public Container(T value){
        setValue(value);

    }

    public void setValue(T value) {
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public void printValue(){
        System.out.println("Class of value: " + value.getClass());
    }
    //  method that returns true if value is null.
    public boolean isEmpty(){
        return this.value == null;
    }
}

// Task 3 - Create Pair<K, V> class here
class Paire<K,V>{
    K key;
    V value;
    public Paire(K key, V value){
        setKey(key);
        setValue(value);
    }
    // SWAP METHOD
    public Paire swap(){
       return new Paire(this.getValue(), this.getKey());
    }
    // TOSTRING METHOD
    @Override
    public String toString() {
        return "Key: " + this.getKey() + " Value: " + this.getValue();
    }

    // GETTERS
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // SETTERS
    public void setKey(K key){
        this.key = key;
    }
    public  void setValue(V value){
        this.value = value;
    }

}
