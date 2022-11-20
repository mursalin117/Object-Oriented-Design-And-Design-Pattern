public class UngraduateStudent extends Student{
    private String course;

    @Override
    public void enroll(String course) {
        this.course = course;
    }

    public void update() {

    }
}
