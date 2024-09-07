public class Student {
    String name;
    String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public void display() {
        System.out.println("Name: " + name + ", Student ID: " + studentID);
    }
}

