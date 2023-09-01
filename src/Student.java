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
    
}
