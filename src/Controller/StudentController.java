public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) { model.setName(name); }
    public String getStudentName() { return model.getName(); }

    public void setStudentAge(int age) { model.setAge(age); }
    public int getStudentAge() { return model.getAge(); }

    public void updateView() {
        view.showStudent(model.getName(), model.getAge());
    }
}
