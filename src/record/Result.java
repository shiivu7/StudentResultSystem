package record;

public class Result {

    private int studentId;
    private String subject;
    private int marks;

    public Result(int studentId, String subject, int marks) {
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Result [studentId=" + studentId +
                ", subject=" + subject +
                ", marks=" + marks + "]";
    }
}