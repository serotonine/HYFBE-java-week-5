# Generics Basics

Generics let you write classes and methods that work with different types while keeping type safety.

---

## 1. Generic Classes

```java
public class Box<T>
{
    private T value;

    public Box(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}
```

---

## 2. Generic Methods

```java
public class Utils
{
    public static <T> void printFirst(List<T> items)
    {
        if (!items.isEmpty())
        {
            System.out.println(items.get(0));
        }
    }
}
```

---

## 3. Bounded Type Parameters

```java
public class NumberBox<T extends Number>
{
    private T number;

    public NumberBox(T number)
    {
        this.number = number;
    }

    public double toDouble()
    {
        return number.doubleValue();
    }
}
```

---

## 4. Wildcards

```java
public static double sumNumbers(List<? extends Number> numbers)
{
    double sum = 0;
    for (Number n : numbers)
    {
        sum += n.doubleValue();
    }
    return sum;
}

public static void addDefaults(List<? super Integer> numbers)
{
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
}
```

---

## 5. Common Pitfalls

- Avoid raw types: use `List<String>`, not `List`.
- You cannot instantiate type parameters: `new T()` is invalid.
- Generics are erased at runtime (type erasure).
- Prefer `List<?>` when the type does not matter.

---

## Learning Outcomes

- Understand how generics improve type safety.
- Use generic classes and methods.
- Apply bounded wildcards to read and write safely.
