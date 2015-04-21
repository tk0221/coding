import java.util.Scanner;
public class GradeBookTest
{

    public static void main(String[] args)
    {
	Scanner input = new Scanner( System.in );
	
	//GradeBook myGradeBook = new GradeBook();

	GradeBook gradeBook1 = new GradeBook("CS101 Intro to Java Programming");
	GradeBook gradebook2 = new GradeBook("CS102 data structures in Java");

	System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName());

	System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName());
    }
}
