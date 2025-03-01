//Name:Sahil Awatramani
//PRN:23070126112
//Batch:B2
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Adding a new student
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    String prn = scan.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    float cgpa = scan.nextFloat();
                    scan.nextLine(); // Consume newline

                    // Adding student to the list
                    operations.addStudent(new Student(name, prn, dept, batch, cgpa));
                    break;

                case 2:
                    // Display all students
                    operations.displayStudents();
                    break;

                case 3:
                    // Searching student by PRN
                    System.out.print("Enter PRN to search: ");
                    String searchPrn = scan.nextLine();
                    Student foundPrn = operations.searchByPRN(searchPrn);
                    if (foundPrn != null) 
                        foundPrn.display();
                    else 
                        System.out.println("Student not found.");
                    break;

                case 4:
                    // Searching student by name
                    System.out.print("Enter Name to search: ");
                    String searchName = scan.nextLine();
                    Student foundName = operations.searchByName(searchName);
                    if (foundName != null) 
                        foundName.display();
                    else 
                        System.out.println("Student not found.");
                    break;

                case 5:
                    // Deleting student by PRN
                    System.out.print("Enter PRN to delete: ");
                    String delPrn = scan.nextLine();
                    if (operations.deleteStudent(delPrn)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
