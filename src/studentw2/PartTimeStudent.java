package studentw2;

/**
 *
 * @author Sarah
 */
public class PartTimeStudent extends StudentW2{
    
    private int numOfCourse;

    public PartTimeStudent(int numOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfCourse = numOfCourse;
    }
    
    public int getNumOfCourse() {
        return numOfCourse;
    }

    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }
    
}
