import java.util.*;

// StudentOperations.java - Class for performing student operations
class StudentOperations {
    private ArrayList<Student> students; // List to store student objects

    // Constructor to initialize student list
    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully.");
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                student.display();
            }
        }
    }

    // Method to search for a student by PRN
    public Student searchByPRN(String prn) {
        for (Student student : students) {
            if (student.getPRN().equals(prn)) { // String comparison using .equals()
                return student;
            }
        }
        return null; // Return null if student not found
    }

    // Method to search for a student by name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) { // Ignore case while comparing names
                return student;
            }
        }
        return null; // Return null if student not found
    }

    // Method to delete a student by PRN
    public boolean deleteStudent(String prn) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getPRN().equals(prn)) { // Compare PRNs using .equals()
                iterator.remove(); // Remove student from list
                return true;
            }
        }
        return false; // Return false if student not found
    }
}
