public class Main {
    public static void main(String[] args) {

        Student model = new Student("John Doe", 20);
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);

        // Display initial data
        controller.updateView();

        // Update model
        controller.setStudentName("Alex");
        controller.setStudentAge(22);

        // Display updated data
        controller.updateView();
    }
}
