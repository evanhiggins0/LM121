public class StudentResult {

    private String id;
    private TestResult tR;

    public StudentResult(String studentID) {
        this.id = studentID;
        tR = new TestResult();
    }

    public StudentResult(String studentID, int numScores) {
        this.id = studentID;
        tR = new TestResult(numScores);
    }

    public String getID() {
        return this.id;
    }

    public void addResult(int testId, double value) {
        tR.setScore(testId, value);
    }

    public String toString() {

        return tR.toString() + "\n";
    }
}
