# Modern Java Preview (Sealed Classes & Pattern Matching)

This is a short preview of features commonly mentioned in Java 21 and Java 25 certification prep.

---

## 1. Sealed Classes

```java
public sealed class Shape permits Circle, Rectangle {}

public final class Circle extends Shape {}
public non-sealed class Rectangle extends Shape {}
```

- Restricts which classes can extend or implement a type.
- Use `final`, `sealed`, or `non-sealed` on permitted subclasses.

---

## 2. Pattern Matching for instanceof

```java
if (obj instanceof String text)
{
    System.out.println(text.length());
}
```

- Combines type check and cast.
- Pattern variable is scoped to the true branch.

---

## Learning Outcomes

- Explain what sealed classes are used for.
- Recognize pattern matching with `instanceof`.
