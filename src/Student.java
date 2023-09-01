public class Student {
    private String firstName, lastName;
    private Float GPA;
    private String idNumber;

    public Student()
    {
        firstName = "John";
        lastName = "Doe";
        GPA = 4.0f;
        idNumber = "12345";
    }

    public Student(String fName, String lName, Float gpa, String ID)
    {
        firstName = fName;
        lastName = lName; 
        GPA = gpa;
        idNumber = ID; 
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String name)
    {
        firstName = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String name)
    {
        lastName = name;
    }

    public Float getGPA()
    {
        return GPA;
    }

    public void setGPA(Float gpa)
    {
        GPA = gpa;
    }

    public String getID()
    {
        return idNumber;
    }

    public void setID(String id)
    {
        idNumber = id;
    }



    public String toString()
    {
        return "Student Name- " + getFirstName() + getLastName() + "\nGPA- " + getGPA() + "\nID Number " + getID();

    }
    
}
