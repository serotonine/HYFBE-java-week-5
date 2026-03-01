# Records in Java

Records are immutable, data-focused classes introduced in Java to simplify the creation of data carrier classes.

---

## What are Records?

```java
public record Point(int x, int y) {}
```

Records are a special kind of class that:
- Are **immutable** by design
- Automatically provide implementations of `equals()`, `hashCode()`, and `toString()`
- Generate a canonical constructor based on the declared components
- Provide accessor methods for each component

---

## Key Features

### 1. Automatic Constructor
The canonical constructor is automatically generated based on the record components:

```java
public record Person(String name, int age) {}

// Usage
Person person = new Person("Alice", 30);
```

### 2. Accessor Methods
Accessor methods are automatically generated with the same name as the component:

```java
Person person = new Person("Alice", 30);
System.out.println(person.name());  // Alice
System.out.println(person.age());   // 30
```

### 3. Built-in Methods
Records automatically provide:
- `equals()`: Compares all components
- `hashCode()`: Based on all components
- `toString()`: Returns a string representation of all components

---

## Custom Validation

You can add validation by defining a custom canonical constructor:

```java
public record Person(String name, int age) {
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
}
```

---

## When to Use Records

Records are ideal for:
- Data Transfer Objects (DTOs)
- Value objects
- Immutable data structures
- Simple data carriers without complex behavior

---

## Learning Outcomes

- Understand what records are and when to use them
- Recognize the automatic features provided by records
- Know how to add custom validation to records
- Identify syntax and usage patterns for certification exams
