## Overview
This project is a **menu-driven Java program** designed to manage student records efficiently. It demonstrates key **object-oriented programming (OOP) concepts** such as **classes, objects, constructors, instance members, and array of objects**. The program allows users to **add, display, search, update, and delete student records** based on PRN (Permanent Registration Number) or name.

## Features
- **Add a Student**: Users can input student details including name, PRN, department, batch, and CGPA.
- **Display Students**: Displays the list of all students stored in the system.
- **Search Student**:
  - By **PRN**: Retrieves a student record based on the unique PRN.
  - By **Name**: Searches for a student by name (case-insensitive).
- **Update Student Details**: Allows modification of student information.
- **Delete a Student**: Removes a student record from the system using PRN.
- **Menu-Driven Interface**: Provides an easy-to-use command-line interface for seamless interaction.

## Project Structure
```
StudentManagement/
│── bin/                # Compiled .class files
│── src/                # Source code files
│   ├── Main.java       # Contains the main program with menu-driven logic
│   ├── Student.java    # Defines the Student class with attributes and methods
│   ├── StudentOperations.java  # Handles all student-related operations
│── README.md           # Documentation file
│── .gitignore          # Specifies files to be ignored in version control
```

## Technologies Used
- **Java** (JDK 8 or later)
- **Object-Oriented Programming (OOP) Principles**
- **Collection Framework (ArrayList)**
- **Scanner Class** for user input handling

## Installation & Execution
### Prerequisites:
Ensure you have **Java JDK** installed on your system. If not, download and install it from:
[Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

### Steps to Run:
1. **Clone or Download the Repository**:
   ```sh
   git clone https://github.com/your-repository-link.git
   ```
   Navigate to the project directory:
   ```sh
   cd StudentManagement
   ```

2. **Compile the Java Files**:
   ```sh
   javac src/*.java -d bin/
   ```

3. **Run the Program**:
   ```sh
   java -cp bin Main
   ```

## Usage Instructions
1. Run the program and follow the menu displayed.
2. Choose an option by entering the corresponding number.
3. Enter the required student details when prompted.
4. View, search, update, or delete student records as needed.
5. Exit the program when done.

## Example Run
```
Menu:
1. Add Student
2. Display Students
3. Search by PRN
4. Search by Name
5. Delete Student
6. Exit
Enter your choice: 1

Enter Name: John Doe
Enter PRN: 12345678901
Enter Department: Computer Science
Enter Batch: 2023
Enter CGPA: 9.2
Student Added Successfully.
```

## Future Enhancements
- Implement **file handling** to store student records persistently.
- Introduce **GUI support** using JavaFX or Swing.
- Enable **database connectivity** for better data management.


## License
This project is licensed under the **MIT License**. Feel free to use and modify it as needed.
