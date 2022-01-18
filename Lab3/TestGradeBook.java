public class TestGradeBook {
    public static void main(String[] args){

    GradeBook x = new GradeBook("CS4013", 3);
    GradeBook y = new GradeBook("CS4004", 3);

    x.addStudentResult("Evan Higgins", 0, 80);
    x.addStudentResult("Evan Higgins", 1, 75);
    x.addStudentResult("Evan Higgins", 2, 65);
    x.addStudentResult("Bobby Fischer", 0, 78);
    x.addStudentResult("Bobby Fischer", 1, 70);
    x.addStudentResult("Bobby Fischer", 2, 90);
    y.addStudentResult("Garry Kasparov", 0, 60);
    y.addStudentResult("Garry Kasparov", 1, 89);
    y.addStudentResult("Garry Kasparov", 2, 50);
    y.addStudentResult("Magnus Carlsen", 0, 65);
    y.addStudentResult("Magnus Carlsen", 1, 50);
    y.addStudentResult("Magnus Carlsen", 2, 95);

    x.toString();
    y.toString();

    }
}