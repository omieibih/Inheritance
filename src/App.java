import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Student omi = new Student("Omi", "Harcourt", 3.7f,373440);
        Student john = new Student();
        GradStudent dan = new GradStudent("Daniel", "Round", 4.0f, 321764, "3pm to 7pm");
        GradStudent jane = new GradStudent();
        jane.setFirstName("Bridgett");
       // System.out.println(jane);

        ArrayList <Student> students = new ArrayList<Student>();
        students.add(omi);
        students.add(john);
        students.add(dan);
        students.add(jane);

        for (Student s: students)
        {
            System.out.println(s);
        }

    }
}
