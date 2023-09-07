public abstract class Student implements Serializable{
    public String firstName, lastName;
    public Float GPA;
    public int idNumber;

    public Student()
    {
        firstName = "John";
        lastName = "Doe";
        GPA = 4.0f;
        idNumber = 12345;
    }

    public String getSerialData()
    {
        return firstName + "," + lastName + "," + idNumber + "," + GPA + "\n";
    }

    public Student(String fName, String lName, Float gpa, int ID)
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
        return "ID Number is " + idNumber;
    }

    public void setID(int id)
    {
        idNumber = id;
    }

    public abstract String getDegree();


    public String toString()
    {
        return "Student Name- " + getFirstName() + " " + getLastName() + "\nGPA- " + getGPA() + "\n" + getID();

    }
    
}
