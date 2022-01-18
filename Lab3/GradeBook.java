import java.util.ArrayList;
public class GradeBook {

    private String bookName;
    private int numTests;
    private ArrayList<StudentResult> sR;

    public GradeBook(String name, int value) {
        this.numTests = value;
        this.bookName = name;
        this.sR = new ArrayList<>();
    }

    public String getId() {
        return this.bookName;
    }

    public void addStudentResult(String id, int testId, double value) {
        if (sR.size() != 0) {
            for (StudentResult temp : this.sR) {
                if (temp.getID() == id) {
                    temp.addResult(testId, value);
                    return;
                }}}

            StudentResult temp = new StudentResult(id, this.numTests);
            temp.addResult(testId, value);
            this.sR.add(temp);

    }

    public String toString(){
        for (StudentResult student : sR) {
            System.out.print(student.getID() + ": ");
            System.out.print(student.toString());
        }
        return "";
    }
}
