import java.util.*;
public class TestResult {

    private int[] boundaries = {0, 1, 30, 35, 40, 48, 52, 56, 60, 64, 72, 80};
    private String[] grades = {"NG", "F", "D2", "D1", "C3", "C2", "C1", "B3", "B2", "B1", "A2", "A1"};

    private double[] scores;

    public TestResult() {
        scores = new double[3];
    }

    public TestResult(int i) {
        scores = new double[i];
    }

    public void setScore(int i, double value) {
        scores[i] = value;
    }

    public double getScore(int i) {
        return scores[i];
    }

    public double getTotal() {
        double result = 0;
        for (int i = 0; i < scores.length; i++) {
            result += scores[i];
        }
        return result;
    }

    public String getGrade() {
        int i = boundaries.length - 1;
        while (getTotal() < boundaries[i]) {
            i--;
        }
        return grades[i];
    }

    public String toString() { // this is incredibly ugly, i am sorry :(
        for (int i = 0; i < this.scores.length; i++) {
            System.out.print(scores[i] + ", ");
        }
        return getGrade();
    }
}


