# Student Management System

A **menu-driven Java program** designed to manage student records efficiently. This project demonstrates key **Object-Oriented Programming (OOP)** concepts such as **classes, objects, constructors, instance members, exception handling, and collections**. It provides a user-friendly interface to **add, display, search, and delete student records** based on PRN or name.

---

## Features

- **Add Student**  
  Input student details such as name, PRN, department, batch, and CGPA, with validations and duplicate checks.

- **Display Students**  
  View all student records currently stored.

- **Search Student**  
  - By **PRN**: Unique PRN-based search.
  - By **Name**: Case-insensitive search supporting multiple matches.

- **Delete Student**  
  Remove a student record using their PRN.

- **Robust Error Handling**  
  Custom exceptions for:
  - Invalid PRN (must be 11 digits)
  - Invalid CGPA (range: 0.0 – 10.0)
  - Duplicate PRN entries
  - Student not found

- **Menu-Driven Interface**  
  Easy-to-navigate command-line interaction.

---

## Project Structure

```
StudentManagement/
├── bin/                        # Compiled .class files
├── src/                        # Source code files
│   ├── Main.java               # Menu-driven program with user interaction
│   ├── Student.java            # Defines the Student class
│   ├── StudentOperations.java  # Contains methods to manage student records
├── README.md                   # Documentation
├── .gitignore                  # Git ignored files list
```

---

## Technologies Used

- **Java** (JDK 8 or above)
- **Object-Oriented Programming**
- **Java Collections (ArrayList)**
- **Scanner Class** (for user input)
- **Custom Exception Handling**

---

## Installation & Execution

### Prerequisites
- Java JDK installed on your machine  
  [Download Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

### Steps to Run

1. **Clone or Download the Repository**
   ```bash
   git clone https://github.com/your-repository-link.git
   cd StudentManagement
   ```

2. **Compile the Source Code**
   ```bash
   javac src/*.java -d bin/
   ```

3. **Run the Program**
   ```bash
   java -cp bin Main
   ```

---

## Usage Instructions

1. Run the program.
2. Enter a number from the menu to choose an operation.
3. Input student data or search queries as prompted.
4. Perform actions like **Add**, **Search**, **Delete**, or **Display**.
5. Exit the program safely using the menu.

---

## Example Output

```
Menu:
1. Add Student
2. Display Students
3. Search by PRN
4. Search by Name
5. Delete Student
6. Exit
Enter your choice: 1

Enter Name: Alice Johnson
Enter PRN: 23070126112
Enter Department: AIML
Enter Batch: B2
Enter CGPA: 9.1
Student added successfully.
```

---

## Future Enhancements

- **File Handling** for persistent data storage
- **GUI Support** using JavaFX or Swing
- **Database Integration** using JDBC or ORM
- **Update Functionality** for editing student records

---

## License

This project is licensed under the **MIT License**.  
