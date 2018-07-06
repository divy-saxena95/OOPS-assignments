//IMPLEMENTING OBJECT CLASS FUNCTIONS
public class Student
{
    static int lastroll = 70; 
    int rollno;
 
    // Constructor
    Student()
    {
        rollno = lastroll;
        lastroll++;
    }
 
    // Overriding hashCode()
    @Override
    public int hashCode()
    {
        return rollno;
    }
 
    // Driver code
    public static void main(String args[])
    {
        Student s = new Student();
 
        // Below two statements are equivalent
        System.out.println(s);
        System.out.println(s.toString());
    }
}
