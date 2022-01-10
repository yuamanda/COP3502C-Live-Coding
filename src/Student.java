import java.text.DecimalFormat;

public class Student
{
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        DecimalFormat fmt = new DecimalFormat("#.#");
        return firstName + " " + lastName + " (GPA: " + fmt.format(gpa) + ")";
    }
}
