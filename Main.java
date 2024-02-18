public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Doe", "3-2637");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");
        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Data Structures", instructor2, textbook2);
        course1.printCourseInfo();
        course2.printCourseInfo();
    }
}