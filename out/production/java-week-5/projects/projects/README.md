# 🧩 Week 4 Project Ideas – OOP & Collections 


## 1. **Employee Management System** 🏢

**Description:**

* Abstract class: `Employee` (fields: `name`, `salary`)
* Subclasses: `Developer`, `Manager`
* Store all employees in a `List<Employee>`
* Methods: `printPayroll()`, `giveRaise()`, `listManagers()`

**Features:**

* Display all employees
* Give raises based on role
* Print total company payroll

---

## 2. **Library of Movies (Movie Catalog)** 🎬

**Description:**

* Classes: `Movie`, `Actor`, `Director`
* Store movies in a `Map<String, Movie>` (key = title)
* Methods to add, search, and filter movies

**Features:**

* Add new movies
* Search by genre or director
* List all movies featuring a specific actor

---

## 3. **Online Quiz System** ❓

**Concepts:** Inheritance, Polymorphism, List

**Description:**

* Base class: `Question`
* Subclasses: `ChoiceQuestion`, `TrueFalseQuestion`
* Use a `List<Question>` to store quiz items
* Method `displayQuestion()` overridden by subclasses

**Features:**

* Ask user questions
* Collect and check answers
* Display final score

---

## 4. **School Library Borrowing System** 🏫

**Description:**

* Classes: `Book`, `Student`, `Teacher`, `Loan`
* A `Loan` **HAS-A** `Book` and `Member`
* Use `Map<Member, List<Book>>` to track borrowings

**Features:**

* Borrow and return books
* Show who borrowed what
* Display overdue books

---

## 5. **Student Grade Tracker** 🎓

**Description:**

* Classes: `Student`, `Course`, `Grade`
* Store grades in a `Map<Student, List<Grade>>`
* Use encapsulation for fields and validation

**Features:**

* Add students and grades
* Remove failing grades (Iterator)
* Calculate averages

---

## 6. **Bank Account Management System** 💰

**Description:**

* Abstract class: `Account` (fields: `accountNumber`, `balance`)
* Subclasses: `SavingsAccount`, `CheckingAccount`
* Use a static field for `interestRate`
* Store all accounts in a `List<Account>`

**Features:**

* Deposit / withdraw
* Apply interest (static method)
* Display account summaries

---

## 7. **E-Commerce Cart System** 🛒

**Description:**

* Classes: `Product`, `CartItem`, `ShoppingCart`
* A `ShoppingCart` **HAS-A** list of `CartItem`
* Use a `Map<String, CartItem>` for fast lookup

**Features:**

* Add / remove products
* Update quantities
* Calculate total cost

✅ *Teaches practical backend data structures with composition.*

---

## 8. **Music Playlist Manager** 🎵

**Description:**

* Classes: `Song`, `Playlist`
* `Playlist` contains a `List<Song>`
* Methods: addSong(), removeSong(), playNext(), playPrevious()

**Features:**

* Display playlist
* Remove songs using Iterator
* Navigate songs

---

## 9. **Flight Reservation System** ✈️

**Description:**

* Classes: `Flight`, `Passenger`, `Reservation`
* A `Reservation` **HAS-A** `Passenger` and `Flight`
* Store flights in a `List<Flight>`
* Track reservations in a `Map<Passenger, List<Flight>>`

**Features:**

* Book / cancel flights
* View all flights by passenger
* Search for available seats

---

## 10. **Online Store Inventory Management** 🏬

**Description:**

* Classes: `Product`, `Inventory`
* Use `Map<String, Product>` for product catalog
* Use a `Set<String>` to track out-of-stock items
* Use a static field for `totalProducts`

**Features:**

* Add / remove products
* Search and update stock
* Show all available / out-of-stock items

---

