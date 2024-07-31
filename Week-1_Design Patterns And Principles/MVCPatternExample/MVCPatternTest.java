package MVCPatternExample;

// MVCPatternDemo.java
public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("1", "John Doe", "A");

        // Create a StudentView view
        StudentView view = new StudentView();

        // Create a StudentController controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        // Update model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}

