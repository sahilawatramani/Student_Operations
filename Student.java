// Student.java - Class representing a student
class Student {
    private String name;  // Student's name
    private String prn;   // Unique PRN (11-digit ID)
    private String Dept;  // Department of student
    private String Batch; // Batch of student
    private float CGPA;   // Student's CGPA

    // Constructor to initialize student attributes
    public Student(String name, String prn, String Dept, String Batch, float CGPA) {
        this.name = name;
        this.prn = prn;
        this.Dept = Dept;
        this.Batch = Batch;
        this.CGPA = CGPA;
    }

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPRN() {
        return prn;
    }

    public void setPRN(String prn) {
        this.prn = prn;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + " | PRN: " + prn + " | Dept: " + Dept + " | Batch: " + Batch + " | CGPA: " + CGPA);
    }
}
