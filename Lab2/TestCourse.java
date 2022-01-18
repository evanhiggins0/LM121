import java.util.Arrays;

public class TestCourse{
    public static void main(String[] args){

        Course LM121 = new Course("LM121");
        LM121.addStudent("Evan Higgins");
        LM121.addStudent("Joe Bloggs");
        LM121.addStudent("Lando Norris");
    //  LM121.addStudent("Max");  Used to check if array was changing size correctly
    //  LM121.addStudent("Jim");
        LM121.dropStudent("Joe Bloggs");
        System.out.println(Arrays.toString(LM121.getStudents()));
    }
}