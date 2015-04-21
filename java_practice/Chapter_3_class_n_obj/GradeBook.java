public class GradeBook
{

    private String courseName;

    public GradeBook(String name)
    {
	courseName = name;
    }
    

    public void displayMessage(String courseName)
    {
	System.out.printf("Welcome to the Grade Book for\n%s\n", getCourseName());

    }

    public void setCourseName( String name )
    {

	courseName = name;
    }

    public String getCourseName()
    {

	return courseName;
    }

    

}
