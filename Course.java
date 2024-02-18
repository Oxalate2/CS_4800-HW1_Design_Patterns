public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void printCourseInfo() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructor: " + getInstructor().getFirstName() + " " + getInstructor().getLastName());
        System.out.println("Office Number: " + getInstructor().getOfficeNumber());
        System.out.println("Textbook: " + getTextbook().getTitle());
        System.out.println("Author: " + getTextbook().getAuthor());
        System.out.println("Publisher: " + getTextbook().getPublisher());
    }
}