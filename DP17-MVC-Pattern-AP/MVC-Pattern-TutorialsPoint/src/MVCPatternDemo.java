public class MVCPatternDemo {
    public static void main(String[] args) {

        // fetch student record based on his roll no from the database
        Student model = retrieveStudentFromDatabase();

        // create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println();
        System.out.println();

        // update model data
        controller.setStudentName("John");
        controller.setStudentRollNo("123");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");

        return student;
    }
}