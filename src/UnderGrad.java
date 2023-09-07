public class UnderGrad extends Student{

    public UnderGrad()
    {
        firstName = "Jim";
        lastName = "Doe";
        GPA = 4.0f;
        idNumber = 12345;
    }

    public UnderGrad(String fName, String lName, Float gpa, int ID)
    {
        firstName = fName;
        lastName = lName; 
        GPA = gpa;
        idNumber = ID; 
    }

    public String getDegree()
    {
        return "2 or 4 year Degree";
    }
    
}
