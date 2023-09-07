public class GradStudent extends Student {
    private String officeHours;
    private int offices;
    

    public GradStudent()
    {
        firstName = "Jane";
        lastName = "Doe";
        GPA = 4.0f;
        idNumber = 654321;
        officeHours = "9 A.M to 3 P.M";

    }

    public GradStudent(String fname, String lname, Float gpa, int id, String hours)
    {
        firstName = fname;
        lastName = lname; 
        GPA = gpa; 
        idNumber = id; 
        officeHours = hours; 
    }

    public String getDegree()
    {
        return "Graduate Degree";
    }

    public String getOfficeHours()
    {
        return "Office hours are between " + officeHours;
    }

    public void setOfficeHours(String times)
    {
        officeHours = times;
    }

    @Override public String getID()
    {
        return "ID Number is GR-" + idNumber;
    }

    @Override public String toString()
    {
        return "Student Name- " + getFirstName() + " " + getLastName() + "\nGPA- " + getGPA() + "\n" + getID() +"\n" + getOfficeHours();
    }
    
}
