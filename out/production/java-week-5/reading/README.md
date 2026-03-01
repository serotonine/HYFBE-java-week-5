# 📖 Reading Files in Java

Reading data from files is one of the most common and useful operations in Java.
Whether you’re reading configuration data, user input, or large text files, Java provides efficient tools for handling file input safely and effectively.

---

## 🔑 Key Concepts

### **1. FileReader**

* Used for reading **character data** from text files.
* Reads one character at a time or into a character array.
* Slower for large files because it doesn’t use buffering internally.

---

### **2. BufferedReader**

* Wraps around `FileReader` to improve performance.
* Reads large chunks of data at once using an internal buffer.
* Provides convenient methods like `readLine()` for reading full lines easily.

📘 **Syntax:**

```java
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
```

---

### **3. Why Use Buffering?**

Without buffering:

* Each `read()` call accesses the disk directly → **slow**.

With buffering:

* Data is read into memory in chunks → **fast and efficient**.

Hence, we typically use:

```java
new BufferedReader(new FileReader("file.txt"))
```

instead of just `new FileReader("file.txt")`.

---

### **4. Common Exceptions**

| Exception               | Description                                                      |
|-------------------------|------------------------------------------------------------------|
| `FileNotFoundException` | Thrown if the file doesn’t exist or can’t be opened.             |
| `IOException`           | Thrown for general input/output errors (like permission issues). |

Always use **try-with-resources** to automatically close the file after reading.

---

### **5. Reading Line by Line**

Reading files line by line is efficient for text data like logs, CSVs, or configuration files.

📘 **Example pattern:**

```java
try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) 
{
    String line;
    while ((line = reader.readLine()) != null) 
    {
        System.out.println(line);
    }
} 
catch (IOException e) 
{
    e.printStackTrace();
}
```

---

## 🧠 Summary

- Use **FileReader** for basic character input.
- Wrap it with **BufferedReader** for efficiency.
- Always handle **FileNotFoundException** and **IOException**.
- Prefer **try-with-resources** to auto-close readers.
- Read **line by line** when working with text data.

---

## 🧩 Learning Outcomes

By completing these examples and exercises, students will:

- Understand **how to read text files in Java**
- Use **FileReader** and **BufferedReader** effectively
- Handle **I/O exceptions** correctly
- Process file content line by line
- Perform useful text operations like counting, searching, and reversing

---

